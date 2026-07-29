# Ex.No:4 To create a two screens , first screen will take one number input from user. After click on Factorial button, second screen will open and it should display factorial of the same number using Explicit Intents.


## AIM:

To create a two screens , first screen will take one number input from user. After click on Factorial button, second screen will open and it should display factorial of the same number using Explicit Intents.


## EQUIPMENTS REQUIRED:

Latest Version Android Studio

## ALGORITHM:

### Step 1
Launch the application.

### Step 2
Enter a positive integer in the input field.

### Step 3
Click the **Calculate** button.

### Step 4
Pass the entered number from the first activity to the second activity using an **Explicit Intent**.

### Step 5
Receive the number in the second activity.

### Step 6
Calculate the factorial using a loop.

### Step 7
Display the factorial result on the second screen.

### Step 8
Click **Go Back to Home Page** to return to the first screen.


## PROGRAM:

### Developed by: Niranjani.C
### Registeration Number : 212223220069

### MainActivity.Java
```
package com.example.factorial;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etNumber;
    Button btnFactorial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber = findViewById(R.id.etNumber);
        btnFactorial = findViewById(R.id.btnFactorial);

        btnFactorial.setOnClickListener(v -> {
            String input = etNumber.getText().toString();
            if (input.isEmpty()) {
                Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
                return;
            }

            int number = Integer.parseInt(input);

            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("number", number);
            startActivity(intent);
        });
    }
}
```
### MainActivity2.java
```
package com.example.factorial;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TextView tvResult;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiy2);

        tvResult = findViewById(R.id.tvResult);
        btnBack = findViewById(R.id.btnBack);

        int number = getIntent().getIntExtra("number", 0);

        long factorial = 1;

        for(int i = 1; i <= number; i++)
        {
            factorial = factorial * i;
        }

        tvResult.setText("Factorial of " + number + " = " + factorial);


        btnBack.setOnClickListener(v -> {

            Intent intent = new Intent(MainActivity2.this, MainActivity.class);
            startActivity(intent);

        });
    }
}
```
## OUTPUT

<img width="630" height="1400" alt="WhatsApp Image 2026-07-29 at 8 02 40 AM" src="https://github.com/user-attachments/assets/a2293f01-c08b-477d-acc9-21e3e152049e" />

<img width="630" height="1400" alt="WhatsApp Image 2026-07-29 at 8 02 41 AM" src="https://github.com/user-attachments/assets/f5fbcfd8-2b83-48cf-8c93-0c3fa0ac1fe5" />

<img width="630" height="1400" alt="WhatsApp Image 2026-07-29 at 8 02 41 AM (1)" src="https://github.com/user-attachments/assets/33caddc3-1301-4792-9c6d-14edd00da75f" />

## RESULT
Thus a Simple Android Application create a Explicit Intents using Android Studio is developed and executed successfully.


