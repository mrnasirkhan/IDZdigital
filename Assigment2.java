// MainActivity.java
public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private EmployeeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.employeeRecyclerView);
        adapter = new EmployeeAdapter();

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        // Fetch JSON data and update the adapter
        new FetchDataTask().execute("https://aamras.com/dummy/EmployeeDetails.json");
    }

    private class FetchDataTask extends AsyncTask<String, Void, String> {
        // Implement the doInBackground and onPostExecute methods
        // ...
    }
}
