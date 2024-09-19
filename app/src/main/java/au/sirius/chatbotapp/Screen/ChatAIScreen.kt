package au.sirius.chatbotapp.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import au.sirius.chatbotapp.R
import au.sirius.chatbotapp.ViewModel.ChatAIViewModel

@Composable
fun ChatAiScreen(
    AIviewModel: ChatAIViewModel = viewModel()
) {
    var prompt by remember {
        mutableStateOf("")
    }
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "AIChat Room", fontSize = 20.sp, fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            OutlinedTextField(
                value = prompt,
                onValueChange = { prompt = it },
                textStyle = TextStyle.Default.copy(fontSize = 16.sp),
                modifier = Modifier
                    .weight(1f)
                    .padding(8.dp),
                shape = RoundedCornerShape(16.dp)
            )

            IconButton(onClick = {
                AIviewModel.getResponse(prompt)
                prompt = ""
            }) {
                Icon(imageVector = Icons.Default.Send, contentDescription = "Send")
            }

        }
        Spacer(modifier = Modifier.height(16.dp))
        Box(
            modifier = Modifier
                .background(
                    Color.Gray, shape = RoundedCornerShape(8.dp)
                )
                .padding(8.dp)
                .verticalScroll(scrollState)
        ) {
            Text(
                text = AIviewModel.response.value,
                style = TextStyle(fontSize = 16.sp),
                color = Color.White
            )
        }
    }
}