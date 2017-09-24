package com.mialearningdroid.moneydiary;

/*Requirements:
 Create expense diary app to record the expense by using this application.
 Should have categories for user to select and enter their amount.
 Show all the expenses recorded in a table for user to review.
 Summary of total income and expenses


 Project scope:
 Prototype from android studio.
 Show a page of records of income and expenses
 Show a page to summaries the income or expenses
*/

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class tab1summary extends Fragment {

    String sIncomeInfo, sExpensesInfo;
    private EditText incomeInfo,expensesInfo;
    private Button calculateButton;
    private TextView balanceInfo;
    private Spinner spinner1, spinner2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tab1summary, container, false);

        //Indicating the calculate button from the layout id and its typ
        incomeInfo = (EditText) rootView.findViewById(R.id.income);
        expensesInfo = (EditText) rootView.findViewById(R.id.expenses);
        calculateButton = (Button) rootView.findViewById(R.id.Calculate);
        balanceInfo = (TextView) rootView.findViewById(R.id.Balance);
        spinner1 = (Spinner) rootView.findViewById(R.id.Income_Category);
        spinner2 = (Spinner) rootView.findViewById(R.id.Expenses_category);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sIncomeInfo = incomeInfo.getText().toString();
                sExpensesInfo = expensesInfo.getText().toString();
                //Log.d(TAG, "Mia: IncomeInfo String:" + sIncomeInfo);
                //Log.d(TAG, "Mia: ExpensesInfo String:" + sExpensesInfo);

                int result = Integer.parseInt(sIncomeInfo) - Integer.parseInt(sExpensesInfo);
                String results = String.valueOf(result);
                //Log.d(TAG, "Mia: result String:" + result);
                balanceInfo.setText("$ " + results);

                Toast.makeText(getContext(),"Results and spinners :" + results + "\nSpinner 1 : " + String.valueOf(spinner1.getSelectedItem()) +
                        "\nSpinner 2 : " + String.valueOf(spinner2.getSelectedItem()) , Toast.LENGTH_SHORT).show();
            }
        });


        return rootView;
    }

//    public void onItemSelected(AdapterView<?> parent, View view, int pos,long id) {
//        Toast.makeText(parent.getContext(),
//                "OnItemSelectedListener : " + parent.getItemAtPosition(pos).toString(),
//                Toast.LENGTH_SHORT).show();
//    }
}




