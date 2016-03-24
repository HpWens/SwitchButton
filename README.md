# SwitchButton

![image](https://github.com/HpWens/SwitchButton/blob/master/app/src/main/java/assets/switch.gif)

![image](https://github.com/HpWens/SwitchButton/blob/master/app/src/main/java/assets/close.png)

![image](https://github.com/HpWens/SwitchButton/blob/master/app/src/main/java/assets/open.png)

##Using

1 下载源码导入widget包到你的项目中。

2 res/values/attrs 文件中添加 
    
    ```   
    <declare-styleable name="SwitchButtonView">
        <attr name="checked" format="boolean"></attr>
    </declare-styleable>
```

3 在你布局文件添加

    ```   
    <com.github.ws.switchbuttonview.widget.SwitchButtonView
        xmlns:widget="http://schemas.android.com/apk/res-auto"
        android:id="@+id/sbv"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        widget:checked="false" />
```
注意：com.github.ws.switchbuttonview.widget.SwitchButtonView对应你自己的SwitchButtonView的文件路径

4 Activity中

    ```   
          mSwitch= (SwitchButtonView) findViewById(R.id.sbv);
        mSwitch.setOnSwitchListener(new SwitchButtonView.onSwitchListener() {
            @Override
            public void onSwitchChanged(boolean isCheck) {
            }
        });
```






