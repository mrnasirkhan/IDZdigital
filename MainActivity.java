// MainActivity.java
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle registration button click
                String name = ((EditText) findViewById(R.id.editTextName)).getText().toString();
                String dob = ((EditText) findViewById(R.id.editTextDOB)).getText().toString();
                String email = ((EditText) findViewById(R.id.editTextEmail)).getText().toString();

                // Pass data to Activity 2
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("dob", dob);
                intent.putExtra("email", email);
                startActivity(intent);
            }
        });
    }
}
