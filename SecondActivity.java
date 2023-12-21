// SecondActivity.java
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Receive data from Activity 1
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String dob = intent.getStringExtra("dob");
        String email = intent.getStringExtra("email");

        // Display data
        TextView textViewDisplay = findViewById(R.id.textViewDisplay);
        textViewDisplay.setText("Name: " + name + "\nDOB: " + dob + "\nEmail: " + email);

        // Store data in SQLite database or Array
        // Implement SQLite database operations or Array storage here
    }
}
