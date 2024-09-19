package au.sirius.chatbotapp.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import au.sirius.chatbotapp.R
import au.sirius.chatbotapp.ViewModel.AuthViewModel
import au.sirius.chatbotapp.data.Result
import au.sirius.chatbotapp.ui.theme.lightBlue

@Composable
fun SignInScreen(
    authViewModel: AuthViewModel,
    onNavigateToSignUp: () -> Unit,
    onSignInSuccess: () -> Unit
) {

    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    val result by authViewModel.authResult.observeAsState()

    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        elevation = 4.dp,
        backgroundColor = lightBlue
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.myimage),
                contentDescription = null,
                alignment = Alignment.Center
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "I'm Beside You Prototype",
                fontSize = 20.sp,
//                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.W900,
                fontFamily = FontFamily.Monospace
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Enter Your Credentials to Login",
                fontSize = 16.sp
            )
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = { Text(text = "Email") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            )
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Password") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                visualTransformation = PasswordVisualTransformation()
            )
            Button(
                onClick = {
                    authViewModel.login(email, password)
                    when (result) {
                        is Result.Success<*> -> {
                            onSignInSuccess()
                        }
                        is Result.Error -> {

                        }
                        else -> {

                        }
                    }
                },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                    ) {
                    Text("Login")
                }
                    Spacer(modifier = Modifier.height(16.dp))
                    Text("Don't have an account? Sign up.",
                        modifier = Modifier.clickable { onNavigateToSignUp() }
                    )
                }
        }

    }



