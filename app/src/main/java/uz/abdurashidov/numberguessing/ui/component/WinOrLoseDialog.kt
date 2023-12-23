package uz.abdurashidov.numberguessing.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import uz.abdurashidov.numberguessing.R
import uz.abdurashidov.numberguessing.ui.theme.YellowDark

@Composable
fun WinOrLoseDialog(
    text: String,
    buttonText: String,
    mysteryText: String,
    image: Painter,
    resetGame: () -> Unit
) {
    Dialog(onDismissRequest = resetGame) {
        Column(
            modifier = Modifier
                .size(300.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(YellowDark),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = text,
                fontWeight = FontWeight.Bold,
                fontSize = 28.sp,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "The Mystery number is $mysteryText",
                fontWeight = FontWeight.Bold,
                fontSize = 26.sp,
                textAlign = TextAlign.Center,
                fontFamily = FontFamily.Cursive
            )
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier.size(80.dp)
            )
            Button(
                onClick = resetGame,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue,
                    contentColor = Color.White
                )
            ) {
                Text(text = buttonText, fontSize = 18.sp)
            }
        }
    }
}

@Preview
@Composable
private fun WinOrLoseDialogPreview() {
}