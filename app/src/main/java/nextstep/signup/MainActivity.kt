package nextstep.signup

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import nextstep.signup.ui.SignUpButton
import nextstep.signup.ui.SignUpSurfaceColumn
import nextstep.signup.ui.SignUpTextField
import nextstep.signup.ui.SignupTitle
import nextstep.signup.ui.theme.SignupTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SignupTheme {
                SignUpSurfaceColumn {
                    SignupTitle(Modifier.padding(top = 60.dp))
                    SignUpTextField(
                        Modifier.padding(top = 36.dp),
                        getString(R.string.user_name),
                        false,
                    )
                    SignUpTextField(
                        Modifier.padding(top = 36.dp),
                        getString(R.string.email),
                        false,
                    )
                    SignUpTextField(
                        Modifier.padding(top = 36.dp),
                        getString(R.string.password),
                        true,
                    )
                    SignUpTextField(
                        Modifier.padding(top = 36.dp),
                        getString(R.string.password_confirm),
                        true,
                    )
                    SignUpButton(
                        Modifier
                            .padding(top = 42.dp),
                        getString(R.string.sign_up),
                    )
                }
            }
        }
    }
}
