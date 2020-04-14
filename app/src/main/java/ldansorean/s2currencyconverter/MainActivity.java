package ldansorean.s2currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static Double EXCHANGE_RATE = 1.23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view) {
        EditText amountEditText = findViewById(R.id.amount);
        try {
            Double amount = Double.parseDouble(amountEditText.getText().toString());
            Double usd = amount * EXCHANGE_RATE;
            Toast.makeText(getApplicationContext(), usd + "$", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Invalid pounds amount. Must be a number.", Toast.LENGTH_SHORT).show();
        }
    }
}
