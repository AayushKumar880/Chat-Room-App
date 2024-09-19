package au.sirius.chatbotapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import au.sirius.chatbotapp.Screen.ChatAiScreen
import au.sirius.chatbotapp.Screen.ChatRoomListScreen
import au.sirius.chatbotapp.Screen.ChatScreen
import au.sirius.chatbotapp.Screen.Screen
import au.sirius.chatbotapp.Screen.SignInScreen
import au.sirius.chatbotapp.Screen.SignUpScreen
import au.sirius.chatbotapp.Screen.VideoScreen
import au.sirius.chatbotapp.ViewModel.AuthViewModel
import au.sirius.chatbotapp.ViewModel.RoomViewModel
import au.sirius.chatbotapp.ui.theme.ChatBotAppTheme
import au.sirius.chatbotapp.ui.theme.lightBlue
import au.sirius.chatbotapp.ui.theme.lightPink
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            val authViewModel: AuthViewModel = viewModel()
            val currentUser = FirebaseAuth.getInstance().currentUser
            ChatBotAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    if (currentUser != null) {
                        // User is signed in, navigate to ChatRoomScreen
                        Navigate(
                            navController = navController,
                            authViewModel = authViewModel,
                            startDestination = Screen.ChatRoomScreen.route
                        )
                    } else {
                        // User is not signed in, navigate to SignUpScreen
                        Navigate(
                            navController = navController,
                            authViewModel = authViewModel,
                            startDestination = Screen.SignUpScreen.route
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Navigate(
    navController: NavHostController, authViewModel: AuthViewModel, startDestination: String
) {
//    Box(modifier = Modifier.fillMaxSize()) {
//        Image(
//            painter = painterResource(id = R.drawable.newBg),
//            contentDescription = "Background",
//            contentScale = ContentScale.FillBounds,
//            modifier = Modifier.matchParentSize()
//        )
//    }
    Box(
        modifier = Modifier
            .fillMaxSize() // Fills the entire screen
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        lightBlue,
                        lightPink
                    )
                )
            )
    ) {
        // Add content inside the Box if needed
    }
    NavHost(navController = navController, startDestination = startDestination) {
        composable(Screen.SignUpScreen.route) {
            SignUpScreen(authViewModel = authViewModel, onNavigateToLogin = {
                navController.navigate(Screen.LoginScreen.route)
            })
        }

        composable(Screen.LoginScreen.route) {
            SignInScreen(authViewModel = authViewModel, onNavigateToSignUp = {
                navController.navigate(Screen.SignUpScreen.route)
            }) {
                navController.navigate(Screen.ChatRoomScreen.route)
            }
        }

        composable(Screen.ChatRoomScreen.route) {
            ChatRoomListScreen(roomViewModel = RoomViewModel(),
                onJoinClicked = { navController.navigate("${Screen.ChatScreen.route}/${it.id}") },
                onChatAiClicked = {
                    navController.navigate(Screen.ChatAiScreen.route)
                },
                onNewAccount = { navController.navigate(Screen.SignUpScreen.route) })
        }

        composable(Screen.ChatAiScreen.route) {
            ChatAiScreen()
        }

        composable("${Screen.ChatScreen.route}/{roomId}") {
            val roomId: String = it.arguments?.getString("roomId") ?: ""
            ChatScreen(
                roomId = roomId,
                onVideoClicked = { navController.navigate("${Screen.VideoScreen.route}/${roomId}") }
            )
        }

        composable("${Screen.VideoScreen.route}/{roomId}") {
            val roomId: String = it.arguments?.getString("roomId") ?: ""
            VideoScreen(
                roomId = roomId,
                onNavigateUp = navController::navigateUp
            )
        }
    }
}


