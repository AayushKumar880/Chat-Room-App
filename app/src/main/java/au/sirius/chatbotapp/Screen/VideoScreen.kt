package au.sirius.chatbotapp.Screen

import android.Manifest
import androidx.activity.compose.BackHandler
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.viewmodel.compose.viewModel
import au.sirius.chatbotapp.BuildConfig
import au.sirius.chatbotapp.ViewModel.VideoViewModel
import io.agora.agorauikit_android.AgoraConnectionData
import io.agora.agorauikit_android.AgoraVideoViewer

@OptIn(ExperimentalUnsignedTypes::class)
@Composable
fun VideoScreen(
    roomId: String,
    onNavigateUp: () -> Unit = {},
    videoViewModel: VideoViewModel = viewModel()
){

    var agoraView: AgoraVideoViewer? = null
    val permissionLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestMultiplePermissions(),
        onResult = {perms->
            videoViewModel.onPermissionResult(
                acceptedAudioPermission = perms[Manifest.permission.RECORD_AUDIO] == true,
                acceptedCameraPermission = perms[Manifest.permission.CAMERA] == true
            )
        }
    )

    LaunchedEffect(key1 = true){
        permissionLauncher.launch(
            arrayOf(
                Manifest.permission.RECORD_AUDIO,
                Manifest.permission.CAMERA
            )
        )
    }

    BackHandler {
        agoraView?.leaveChannel()
        onNavigateUp()
    }

    if(videoViewModel.hasAudioPermission.value && videoViewModel.hasCameraPermission.value){
        AndroidView(factory = {
            AgoraVideoViewer(it, connectionData = AgoraConnectionData(
                appId = BuildConfig.apiId
            )).also {
                it.join(roomId)
                agoraView = it
            }
        },
            modifier = Modifier.fillMaxSize()
        )
    }

}