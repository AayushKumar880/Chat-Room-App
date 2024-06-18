package au.sirius.chatbotapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import au.sirius.chatbotapp.Screen.ChatRoomListScreen
import au.sirius.chatbotapp.Screen.ChatScreen
import au.sirius.chatbotapp.Screen.Screen
import au.sirius.chatbotapp.Screen.SignInScreen
import au.sirius.chatbotapp.Screen.SignUpScreen
import au.sirius.chatbotapp.ViewModel.AuthViewModel
import au.sirius.chatbotapp.ui.theme.ChatBotAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            val authViewModel: AuthViewModel = viewModel()
            ChatBotAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Navigate(navController, authViewModel)
                }
            }
        }
    }
}

@Composable
fun Navigate(
    navController: NavHostController,
    authViewModel: AuthViewModel
) {
    NavHost(navController = navController, startDestination = Screen.SignUpScreen.route) {
        composable(Screen.SignUpScreen.route) {
            SignUpScreen(
                authViewModel = authViewModel,
                onNavigateToLogin = {
                    navController.navigate(Screen.LoginScreen.route)
                })
        }

        composable(Screen.LoginScreen.route) {
            SignInScreen(
                authViewModel = authViewModel,
                onNavigateToSignUp = {
                    navController.navigate(Screen.SignUpScreen.route)
                }) {
                navController.navigate(Screen.ChatRoomScreen.route)
            }
        }

        composable(Screen.ChatRoomScreen.route) {
            ChatRoomListScreen {
                navController.navigate("${Screen.ChatScreen.route}/${it.id}")
            }
        }

        composable("${Screen.ChatScreen.route}/{roomId}"){
            val roomId:String = it
                .arguments?.getString("roomId") ?: ""
            ChatScreen(roomId = roomId)
        }

    }

}

