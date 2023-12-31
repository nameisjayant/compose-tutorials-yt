package com.nameisjayant.jetpackcomposetutorialsyt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.nameisjayant.jetpackcomposetutorialsyt.components.BaselinePadding
import com.nameisjayant.jetpackcomposetutorialsyt.components.IntrinsicMeasurementExample
import com.nameisjayant.jetpackcomposetutorialsyt.components.MultiHeaderWithLazyColumn
import com.nameisjayant.jetpackcomposetutorialsyt.components.PaddingValuesExample
import com.nameisjayant.jetpackcomposetutorialsyt.components.WeightModifierExampleOne
import com.nameisjayant.jetpackcomposetutorialsyt.components.WeightModifierExampleThree
import com.nameisjayant.jetpackcomposetutorialsyt.components.WeightModifierExampleTwo
import com.nameisjayant.jetpackcomposetutorialsyt.ui.theme.JetpackComposeTutorialsYtTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTutorialsYtTheme {
                MultiHeaderWithLazyColumn()
            }
        }
    }
}
