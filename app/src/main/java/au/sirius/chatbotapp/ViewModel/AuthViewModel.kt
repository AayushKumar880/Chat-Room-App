package au.sirius.chatbotapp.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import au.sirius.chatbotapp.data.Result
import au.sirius.chatbotapp.data.UserRepository
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.launch

class AuthViewModel : ViewModel() {
    private val userRepository: UserRepository

    init {
        userRepository = UserRepository(
            FirebaseAuth.getInstance(),
            Injection.instance()
        )
    }

    private val _authResult = MutableLiveData<Result<Boolean>>()
    val authResult : LiveData<Result<Boolean>> get()  = _authResult

    fun signUp(email:String,password:String,firstName:String,lastName:String){
        viewModelScope.launch {
            _authResult.value = userRepository.signUp(email,password,firstName,lastName)
        }
    }

    fun login(email: String,password: String){
        viewModelScope.launch {
            _authResult.value = userRepository.login(email, password)
        }
    }

}

object Injection {
    private val instance : FirebaseFirestore by lazy {
        FirebaseFirestore.getInstance()
    }
    fun instance(): FirebaseFirestore{
        return instance
    }
}