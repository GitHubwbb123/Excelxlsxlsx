package com.mrwxb.excelxlsxlsx;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.EditText;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MainActivity extends Activity {

    EditText output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = (EditText) findViewById(R.id.textOut);
    }

    public void onReadClick(View view) {
        ExcelPOIUtil.read(Environment.getExternalStorageDirectory().getPath()+"/test.xlsx",output);

    }

    public void onWriteClick(View view) {
        ExcelPOIUtil.write(Environment.getExternalStorageDirectory().getPath()+"/test.xlsx");
    }
    public void onUpdateClick(View view) {
        ExcelPOIUtil.update(Environment.getExternalStorageDirectory().getPath()+"/test.xlsx",0,2,3,"我是数据更新");
    }


}
