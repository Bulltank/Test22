package localhost.test.test;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class list extends Activity {

    ListView listItemView;

    // Define string array.
    String[] listItemsValue = new String[] {"Test1","Test2","Test3"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        listItemView = (ListView)findViewById(R.id.CategoryList);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_2, android.R.id.text1, listItemsValue);

        listItemView.setAdapter(adapter);

        // ListView setOnItemClickListener function apply here.

        listItemView.setOnItemClickListener(new OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch (position) {
                    case 0:
                        Intent appInfo = new Intent(list.this, start.class);
                        appInfo.putExtra("UserCategory", "Test1");
                        startActivity(appInfo);
                        break;
                    case 1:
                        Intent appInfo2 = new Intent(list.this, start.class);
                        appInfo2.putExtra("UserCategory", "Test2");
                        startActivity(appInfo2);
                        break;
                    case 2:
                        Intent appInfo3 = new Intent(list.this, start.class);
                        appInfo3.putExtra("UserCategory", "Test3");
                        startActivity(appInfo3);
                        break;
                }
            }
        });

    }


}
