package com.example.laichi.gridimagesearch.activities;

import android.app.Activity;

public class ImageSearchSettings extends Activity {
/*
    ArrayList<BaseImageSearchQuery> options;
    ImageSettingArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_search_settings);

        setUpViews();
    }

    public void setUpViews() {
        ListView lv = (ListView) findViewById(R.id.settingView);

        this.options = new ArrayList<BaseImageSearchQuery>();

        this.options.add(new ImageSizeSearchQuery(this));
        this.options.add(new ImageColorSearchQuery(this));
        this.options.add(new ImageTypeSearchQuery(this));

        adapter = new ImageSettingArrayAdapter(this, options);
        lv.setAdapter(adapter);
    }

    public void updateSettings(View v) {
        ArrayList<QueryParameter> params = new ArrayList<QueryParameter>();

        for (int i = 0; i < this.options.size(); i++) {
            BaseImageSearchQuery option = this.options.get(i);
            String key = option.queryParam;
            String value = option.getCurSelected();
            if (value != null) {
                params.add(new QueryParameter(key, value));
            }
        }

        String siteSearchText = ((EditText) findViewById(R.id.siteSearch)).getText().toString();
        if (siteSearchText != null && siteSearchText.length() != 0) {
            params.add(new QueryParameter("sitesearch", siteSearchText));
        }

        Toast.makeText(getBaseContext(), params.toString(), Toast.LENGTH_SHORT).show();
        Intent data = new Intent();
        data.putExtra("params", params);
        setResult(RESULT_OK, data);
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.image_search_settings, menu);
        return true;
    }
    */

}
