package au.sirius.chatbotapp.ViewModel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.ai.client.generativeai.GenerativeModel
import kotlinx.coroutines.launch

class ChatAIViewModel:ViewModel() {

    private val _response = mutableStateOf("Ask your question")
    val response : State<String> = _response

    val generativeModel =
        GenerativeModel(
            // Specify a Gemini model appropriate for your use case
            modelName = "gemini-1.5-flash",
            // Access your API key as a Build Configuration variable (see "Set up your API key" above)
            apiKey = "AIzaSyDQYjp6_vAoKwKmaEbUUe4dS16KheIpMqs"
        )

    fun getResponse(prompt:String){
        viewModelScope.launch {
            val generatedResponse = generativeModel.generateContent(prompt).text
            _response.value = generatedResponse?:"Enter a prompt!!"
        }
    }
}