package nextstep.signup

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import nextstep.signup.ui.theme.SignupTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SignupTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Top,
                    ) {
                        SignupTitle(Modifier.padding(top = 60.dp))
                        SingUpTextField(Modifier.padding(top = 42.dp), "Username")
                        SingUpTextField(Modifier.padding(top = 36.dp), "email")
                        SingUpTextField(Modifier.padding(top = 36.dp), "Password")
                        SingUpTextField(Modifier.padding(top = 36.dp), "Password Confirm")
                    }
                }
            }
        }
    }
}

@Composable
fun SignupTitle(modifier: Modifier = Modifier) {
    Text(
        text = "Welcome to Compose \uD83D\uDE80",
        modifier = modifier,
        fontSize = 26.sp,
        fontWeight = FontWeight.Bold,
    )
}

@Composable
fun SingUpTextField(
    modifier: Modifier = Modifier,
    hint: String,
) {
    val enteredValue = remember { mutableStateOf("") }
    TextField(
        value = enteredValue.value,
        onValueChange = { enteredValue.value = it },
        modifier = modifier,
        maxLines = 1,
        placeholder = { Text(hint) },
        label = { Text(hint) },
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SignupTheme {
        SignupTitle()
    }
}
