# androidshiyan
移动软件开发课程实验

一.Android开发基础实验

​	在下载了android studio并下好依赖后，我创建了一个初始项目MyTestAPP并运行了其自带的mainActivity文件，结果如下:



![屏幕截图 2025-11-18 144027](https://cdn.jsdelivr.net/gh/klebgh/androidshiyan@shiyan1/屏幕截图%202025-11-18%20144027.png)

在运行成功后，我将这个项目传到了github上的androidshiyan的shiyan1分支下

![image-20251118144840357](https://github.com/klebgh/androidshiyan/blob/shiyan1/%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE%202025-11-18%20144710.png?raw=true)



二.Android界面布局实验

​	1.线性布局

​		这里每一行都使用了一个线性布局，每一个文本标签的高度设置为match_parent，宽度设置为0dp，使用layout_weight来控制	标签宽度，且每个文本标签间距1dp。代码和运行效果如下所示

```java
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:background="@color/black"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:fitsSystemWindows="true">

    <!-- 第一行：使用权重分配高度 -->
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="30dp"
        android:orientation="horizontal">

        <!-- 使用字符串资源，避免硬编码 -->
        <TextView
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:background="@drawable/cell_border"
            android:gravity="center"
            android:layout_margin="1dp"
            android:text="One,One"
            android:textColor="@color/white" />

        <!-- 添加其他单元格 -->
        <TextView
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1.5"
            android:background="@drawable/cell_border"
            android:gravity="center"
            android:text="One,Two"
            android:layout_margin="1dp"
            android:textColor="@color/white" />
        <TextView
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:background="@drawable/cell_border"
            android:gravity="center"
            android:text="One,Three"
            android:layout_margin="1dp"
            android:textColor="@color/white" />

        <!-- 添加其他单元格 -->
        <TextView
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:background="@drawable/cell_border"
            android:gravity="center"
            android:text="One,Four"
            android:layout_margin="1dp"
            android:textColor="@color/white" />
        <!-- 更多单元格... -->
    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="30dp"
        android:orientation="horizontal">

        <!-- 使用字符串资源，避免硬编码 -->
        <TextView
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:background="@drawable/cell_border"
            android:gravity="center"
            android:text="Two,One"
            android:layout_margin="1dp"
            android:textColor="@color/white" />

        <!-- 添加其他单元格 -->
        <TextView
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1.5"
            android:background="@drawable/cell_border"
            android:gravity="center"
            android:text="Two,Two"
            android:layout_margin="1dp"
            android:textColor="@color/white" />
        <TextView
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:background="@drawable/cell_border"
            android:gravity="center"
            android:text="Two,Three"
            android:layout_margin="1dp"
            android:textColor="@color/white" />

        <!-- 添加其他单元格 -->
        <TextView
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:background="@drawable/cell_border"
            android:gravity="center"
            android:text="Two,Four"
            android:layout_margin="1dp"
            android:textColor="@color/white" />
        <!-- 更多单元格... -->
    </LinearLayout>
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="30dp"
        android:orientation="horizontal">

        <!-- 使用字符串资源，避免硬编码 -->
        <TextView
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:background="@drawable/cell_border"
            android:gravity="center"
            android:text="Three,One"
            android:layout_margin="1dp"
            android:textColor="@color/white" />

        <!-- 添加其他单元格 -->
        <TextView
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1.15"
            android:background="@drawable/cell_border"
            android:gravity="center"
            android:text="Three,Two"
            android:layout_margin="1dp"
            android:textColor="@color/white" />
        <TextView
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1.2"
            android:background="@drawable/cell_border"
            android:gravity="center"
            android:text="Three,Three"
            android:layout_margin="1dp"
            android:textColor="@color/white" />

        <!-- 添加其他单元格 -->
        <TextView
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:background="@drawable/cell_border"
            android:gravity="center"
            android:text="Three,Four"
            android:layout_margin="1dp"
            android:textColor="@color/white" />
        <!-- 更多单元格... -->
    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="30dp"

        android:orientation="horizontal">

        <!-- 使用字符串资源，避免硬编码 -->
        <TextView
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:background="@drawable/cell_border"
            android:gravity="center"
            android:text="Four,One"
            android:layout_margin="1dp"
            android:textColor="@color/white" />

        <!-- 添加其他单元格 -->
        <TextView
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1.4"
            android:background="@drawable/cell_border"
            android:gravity="center"
            android:text="Four,Two"
            android:layout_margin="1dp"
            android:textColor="@color/white" />
        <TextView
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1.15"
            android:background="@drawable/cell_border"
            android:gravity="center"
            android:text="Four,Three"
            android:layout_margin="1dp"
            android:textColor="@color/white" />

        <!-- 添加其他单元格 -->
        <TextView
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:background="@drawable/cell_border"
            android:gravity="center"
            android:text="Four,Four"
            android:layout_margin="1dp"
            android:textColor="@color/white" />
      
    </LinearLayout>
    
</LinearLayout>
```

![image-20251118150138487](https://github.com/klebgh/androidshiyan/blob/shiyan1/%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE%202025-11-18%20150134.png?raw=true)

​	2.表格布局

​		此布局的每一行使用一个tablerow标签完成，tablerow标签里都是textview标签。对于有提示按键的功能，使用三个等长的文本标签实现，中间的标签没有文本内容，对于无提示按键的功能，只使用一个文本标签。分割线由一个高度为1dp的空文本标签实现。代码和运行结果如下：

```java
<?xml version="1.0" encoding="utf-8"?>
<TableLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/black"
    android:stretchColumns="*"
    android:fitsSystemWindows="true">  <!-- 添加这一行，让所有列平均拉伸 -->

    <!-- 标题行 -->
    <TableRow>
        <TextView
            android:text="Hello TableLayout"
            android:background="#454745"
            android:layout_span="3"
            android:textColor="@color/white" />
    </TableRow>

    <!-- Open 行 -->
    <TableRow>
        <TextView
            android:text="Open..."
            android:textColor="@color/white"
            android:layout_width="0dp"
            android:layout_weight="1"
            android:paddingStart="13dp"
            android:gravity="start"/>

        <TextView
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
        />

        <TextView
            android:text="Ctrl-O"
            android:textColor="@color/white"
            android:layout_width="0dp"
            android:layout_weight="1"
            android:paddingEnd="5dp"
            android:gravity="end"/>     <!-- 文本右对齐 -->
    </TableRow>

    <!-- Save 行 -->
    <TableRow>
        <TextView
            android:text="Save..."
            android:textColor="@color/white"
            android:layout_width="0dp"
            android:layout_weight="1"
            android:paddingStart="13dp"
            android:gravity="start"/>

        <TextView
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"/>

        <TextView
            android:text="Ctrl-S"
            android:textColor="@color/white"
            android:layout_width="0dp"
            android:layout_weight="1"
            android:paddingEnd="5dp"
            android:gravity="end"/>
    </TableRow>

    <!-- Save As 行 -->
    <TableRow>
        <TextView
            android:text="Save As..."
            android:textColor="@color/white"
            android:layout_width="0dp"
            android:layout_weight="1"
            android:paddingStart="13dp"
            android:gravity="start"/>

        <TextView
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"/>

        <TextView
            android:text="Ctrl-Shift-S"
            android:textColor="@color/white"
            android:layout_width="0dp"
            android:layout_weight="1"
            android:paddingEnd="5dp"
            android:gravity="end"/>
    </TableRow>
    <TableRow>
        <TextView
            android:layout_height="1dp"
            android:layout_weight="1"
            android:background="#454745"
            />
    </TableRow>
    <TableRow>
        <TextView
            android:text="X Import..."
            android:textColor="@color/white"
            android:layout_width="0dp"
            android:layout_weight="1"
            android:gravity="start"/>
    </TableRow>
    <TableRow>
        <TextView
            android:text="X Export..."
            android:textColor="@color/white"
            android:layout_width="0dp"
            android:layout_weight="1"
            android:gravity="start"/>

        <TextView
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"/>

        <TextView
            android:text="Ctrl-E"
            android:textColor="@color/white"
            android:layout_width="0dp"
            android:layout_weight="1"
            android:paddingEnd="5dp"
            android:gravity="end"/>
    </TableRow>
    <TableRow>
        <TextView
            android:layout_height="1dp"
            android:layout_weight="1"
            android:background="#454745"
            />
    </TableRow>
    <TableRow>
        <TextView
            android:text="quit"
            android:textColor="@color/white"
            android:layout_width="0dp"
            android:layout_weight="1"
            android:layout_marginStart="13dp"
            android:gravity="start"/>
    </TableRow>
</TableLayout>
```

![image-20251118151537192](https://github.com/klebgh/androidshiyan/blob/shiyan1/%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE%202025-11-18%20151530.png?raw=true)

​	3.约束布局1

​		为了实现视觉上计算器按钮在垂直方向上的均匀分布效果，每一行按钮距离上一行按钮距离85dp（在我这个模拟器下看上去均	匀，可能换一个模拟器就不是这样），代码和运行结果如下所示：

```java
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/white"
    android:fitsSystemWindows="true">

    <TextView
        android:id="@+id/text1"
        android:layout_width="0dp"
        android:layout_height="30dp"
        android:background="#48F8F1"
        android:text="     ConstraintLayoutTest"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />

    <TextView
        android:id="@+id/text2"
        android:layout_width="0dp"
        android:layout_height="50dp"
        android:text="   Input"
        android:textSize="20sp"
        app:layout_constraintTop_toBottomOf="@id/text1"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />

    <Button
        android:id="@+id/button0"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginTop="30dp"
        android:layout_marginStart="10dp"
        android:layout_marginEnd="10dp"
        app:layout_constraintTop_toBottomOf="@+id/text2"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        android:background="#E9A95E"/>

    <!-- 第一行按钮：7, 8, 9, / -->
    <Button
        android:id="@+id/button1"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:text="7"
        android:layout_marginTop="50dp"
        app:layout_constraintWidth_percent="0.25"
        app:layout_constraintTop_toBottomOf="@id/button0"
        app:layout_constraintBottom_toTopOf="@id/button5"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toStartOf="@id/button2" />

    <Button
        android:id="@+id/button2"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:text="8"
        android:layout_marginTop="50dp"
        app:layout_constraintWidth_percent="0.25"
        app:layout_constraintTop_toBottomOf="@id/button0"
        app:layout_constraintStart_toEndOf="@id/button1"
        app:layout_constraintEnd_toStartOf="@id/button3" />

    <Button
        android:id="@+id/button3"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:text="9"
        android:layout_marginTop="50dp"
        app:layout_constraintWidth_percent="0.25"
        app:layout_constraintTop_toBottomOf="@id/button0"
        app:layout_constraintStart_toEndOf="@id/button2"
        app:layout_constraintEnd_toStartOf="@id/button4" />

    <Button
        android:id="@+id/button4"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:text="/"
        android:layout_marginTop="50dp"
        app:layout_constraintWidth_percent="0.25"
        app:layout_constraintTop_toBottomOf="@id/button0"
        app:layout_constraintStart_toEndOf="@id/button3"
        app:layout_constraintEnd_toEndOf="parent" />


    <Button
        android:id="@+id/button5"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:text="4"
        android:layout_marginTop="85dp"
        app:layout_constraintWidth_percent="0.25"
        app:layout_constraintTop_toBottomOf="@id/button1"
        app:layout_constraintBottom_toTopOf="@id/button9"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toStartOf="@id/button6" />

    <Button
        android:id="@+id/button6"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:text="5"
        android:layout_marginTop="85dp"
        app:layout_constraintWidth_percent="0.25"
        app:layout_constraintTop_toBottomOf="@id/button2"
        app:layout_constraintStart_toEndOf="@id/button5"
        app:layout_constraintEnd_toStartOf="@id/button7" />

    <Button
        android:id="@+id/button7"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:text="6"
        android:layout_marginTop="85dp"
        app:layout_constraintWidth_percent="0.25"
        app:layout_constraintTop_toBottomOf="@id/button3"
        app:layout_constraintStart_toEndOf="@id/button6"
        app:layout_constraintEnd_toStartOf="@id/button8" />

    <Button
        android:id="@+id/button8"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:text="×"
        android:layout_marginTop="85dp"
        app:layout_constraintWidth_percent="0.25"
        app:layout_constraintTop_toBottomOf="@id/button4"
        app:layout_constraintStart_toEndOf="@id/button7"
        app:layout_constraintEnd_toEndOf="parent" />


    <Button
        android:id="@+id/button9"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:text="1"
        android:layout_marginTop="85dp"
        app:layout_constraintWidth_percent="0.25"
        app:layout_constraintTop_toBottomOf="@id/button5"
        app:layout_constraintBottom_toTopOf="@id/button13"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toStartOf="@id/button10" />

    <Button
        android:id="@+id/button10"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:text="2"
        android:layout_marginTop="85dp"
        app:layout_constraintWidth_percent="0.25"
        app:layout_constraintTop_toBottomOf="@id/button6"
        app:layout_constraintStart_toEndOf="@id/button9"
        app:layout_constraintEnd_toStartOf="@id/button11" />

    <Button
        android:id="@+id/button11"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:text="3"
        android:layout_marginTop="85dp"
        app:layout_constraintWidth_percent="0.25"
        app:layout_constraintTop_toBottomOf="@id/button7"
        app:layout_constraintStart_toEndOf="@id/button10"
        app:layout_constraintEnd_toStartOf="@id/button12" />

    <Button
        android:id="@+id/button12"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:text="+"
        android:layout_marginTop="85dp"
        app:layout_constraintWidth_percent="0.25"
        app:layout_constraintTop_toBottomOf="@id/button8"
        app:layout_constraintStart_toEndOf="@id/button11"
        app:layout_constraintEnd_toEndOf="parent" />


    <Button
        android:id="@+id/button13"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:text="."
        android:layout_marginTop="85dp"
        app:layout_constraintWidth_percent="0.25"
        app:layout_constraintTop_toBottomOf="@id/button9"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toStartOf="@id/button14" />

    <Button
        android:id="@+id/button14"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:text="0"
        android:layout_marginTop="85dp"
        app:layout_constraintWidth_percent="0.25"
        app:layout_constraintTop_toBottomOf="@id/button10"
        app:layout_constraintStart_toEndOf="@id/button13"
        app:layout_constraintEnd_toStartOf="@id/button15" />

    <Button
        android:id="@+id/button15"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:text="="
        android:layout_marginTop="85dp"
        app:layout_constraintWidth_percent="0.25"
        app:layout_constraintTop_toBottomOf="@id/button11"
        app:layout_constraintStart_toEndOf="@id/button14"
        app:layout_constraintEnd_toStartOf="@id/button16" />

    <Button
        android:id="@+id/button16"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:text="-"
        android:layout_marginTop="85dp"
        app:layout_constraintWidth_percent="0.25"
        app:layout_constraintTop_toBottomOf="@id/button12"
        app:layout_constraintStart_toEndOf="@id/button15"
        app:layout_constraintEnd_toEndOf="parent" />


</androidx.constraintlayout.widget.ConstraintLayout>
```

![image-20251118152421793](https://cdn.jsdelivr.net/gh/klebgh/androidshiyan@shiyan1/%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE%202025-11-18%20152413.png)

​	4.约束布局2

​		布局模式和实验中的展示基本一致，比如最上方的三张图片使用了一个约束布局嵌套了三个约束布局来完成，小火箭距离其右侧	的太阳系24dp等，代码和运行结果如下所示：

```java
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/constraint1"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:fitsSystemWindows="true">

    <androidx.constraintlayout.widget.ConstraintLayout
        android:id="@+id/constraint2"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        app:layout_constraintWidth_percent="0.33"
        android:layout_marginTop="10dp"
        app:layout_constraintTop_toTopOf="@+id/constraint1"
        app:layout_constraintStart_toStartOf="@+id/constraint1">

        <ImageView
            android:id="@+id/img1"
            android:layout_width="72dp"
            android:layout_height="72dp"
            android:src="@drawable/space_station_icon"
            app:layout_constraintBottom_toTopOf="@+id/text1"
            app:layout_constraintStart_toStartOf="@+id/constraint2"
            app:layout_constraintEnd_toEndOf="@+id/constraint2"
            app:layout_constraintTop_toTopOf="@+id/constraint2" />

        <TextView
            android:id="@+id/text1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Space Stations"
            app:layout_constraintBottom_toBottomOf="@+id/constraint2"
            app:layout_constraintStart_toStartOf="@+id/constraint2"
            app:layout_constraintEnd_toEndOf="@+id/constraint2"
            app:layout_constraintTop_toBottomOf="@+id/img1" />

    </androidx.constraintlayout.widget.ConstraintLayout>

    <androidx.constraintlayout.widget.ConstraintLayout
        android:id="@+id/constraint3"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        app:layout_constraintWidth_percent="0.34"
        android:layout_marginTop="10dp"
        app:layout_constraintTop_toTopOf="@+id/constraint1"
        app:layout_constraintStart_toEndOf="@+id/constraint2" >

        <ImageView
            android:id="@+id/img2"
            android:layout_width="72dp"
            android:layout_height="72dp"
            android:src="@drawable/rocket_icon"
            app:layout_constraintBottom_toTopOf="@+id/text2"
            app:layout_constraintStart_toStartOf="@+id/constraint3"
            app:layout_constraintEnd_toEndOf="@+id/constraint3"
            app:layout_constraintTop_toTopOf="@+id/constraint3" />

        <TextView
            android:id="@+id/text2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Flights"
            app:layout_constraintBottom_toBottomOf="@+id/constraint3"
            app:layout_constraintStart_toStartOf="@+id/constraint3"
            app:layout_constraintEnd_toEndOf="@+id/constraint3"
            app:layout_constraintTop_toBottomOf="@+id/img2" />
    </androidx.constraintlayout.widget.ConstraintLayout>

    <androidx.constraintlayout.widget.ConstraintLayout
        android:id="@+id/constraint4"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        app:layout_constraintWidth_percent="0.33"
        android:layout_marginTop="10dp"
        app:layout_constraintTop_toTopOf="@+id/constraint1"
        app:layout_constraintStart_toEndOf="@+id/constraint3">

        <ImageView
            android:id="@+id/img3"
            android:layout_width="72dp"
            android:layout_height="72dp"
            android:src="@drawable/rover_icon"
            app:layout_constraintBottom_toTopOf="@+id/text3"
            app:layout_constraintStart_toStartOf="@+id/constraint4"
            app:layout_constraintEnd_toEndOf="@+id/constraint4"
            app:layout_constraintTop_toTopOf="@+id/constraint4" />

        <TextView
            android:id="@+id/text3"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Rovers"
            app:layout_constraintBottom_toBottomOf="@+id/constraint4"
            app:layout_constraintStart_toStartOf="@+id/constraint4"
            app:layout_constraintEnd_toEndOf="@+id/constraint4"
            app:layout_constraintTop_toBottomOf="@+id/img3" />
    </androidx.constraintlayout.widget.ConstraintLayout>


    <androidx.constraintlayout.widget.ConstraintLayout
        android:id="@+id/constraint5"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        app:layout_constraintWidth_percent="1"
        android:layout_marginTop="20dp"
        app:layout_constraintTop_toBottomOf="@id/constraint3"
        app:layout_constraintStart_toStartOf="@id/constraint1">



        <TextView
            android:id="@+id/text4"
            android:layout_width="130dp"
            android:layout_height="100dp"
            android:text="DCA"
            android:gravity="center"
            android:background="#1E8A21"
            android:layout_marginStart="60dp"
            app:layout_constraintTop_toTopOf="@id/constraint5"
            app:layout_constraintBottom_toBottomOf="@id/constraint5"
            app:layout_constraintStart_toStartOf="@id/constraint5"/>
        <TextView
            android:id="@+id/text5"
            android:layout_width="130dp"
            android:layout_height="100dp"
            android:text="MARS"
            android:gravity="center"
            android:background="#1E8A21"
            android:layout_marginEnd="60dp"
            app:layout_constraintTop_toTopOf="@id/constraint5"
            app:layout_constraintBottom_toBottomOf="@id/constraint5"
            app:layout_constraintEnd_toEndOf="@id/constraint5"/>

        <ImageView
            android:id="@+id/img4"
            android:layout_width="65dp"
            android:layout_height="65dp"
            android:src="@drawable/double_arrows"
            app:layout_constraintBottom_toBottomOf="@id/constraint5"
            app:layout_constraintEnd_toEndOf="@id/constraint5"
            app:layout_constraintStart_toStartOf="@id/constraint5"
            app:layout_constraintTop_toTopOf="@id/constraint5"
            />
    </androidx.constraintlayout.widget.ConstraintLayout>

    <Switch
        android:id="@+id/text6"
        android:layout_width="160dp"
        android:layout_height="45dp"
        android:text="One Way"
        android:background="#E28F1A"
        android:layout_marginTop="15dp"
        android:layout_marginStart="30dp"
        app:layout_constraintTop_toBottomOf="@id/constraint5"
        app:layout_constraintStart_toStartOf="@id/constraint1"/>

    <TextView
        android:id="@+id/text7"
        android:layout_width="wrap_content"
        android:layout_height="45dp"
        android:layout_marginTop="15dp"
        android:layout_marginStart="30dp"
        android:background="#E28F1A"
        android:text="1 Traveller"
        android:gravity="center"
        app:layout_constraintTop_toBottomOf="@id/text6"
        app:layout_constraintStart_toStartOf="@+id/constraint1"/>

    <ImageView
        android:id="@+id/img5"
        android:src="@drawable/galaxy"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:layout_constraintTop_toBottomOf="@id/constraint5"
        app:layout_constraintBottom_toTopOf="@+id/button1"
        app:layout_constraintStart_toStartOf="@id/constraint1"
        app:layout_constraintEnd_toEndOf="@id/constraint1"/>

    <ImageView
        android:id="@+id/img6"
        android:layout_width="29dp"
        android:layout_height="49dp"
        android:src="@drawable/rocket_icon"
        android:layout_marginEnd="24dp"
        app:layout_constraintBottom_toTopOf="@id/button1"
        app:layout_constraintEnd_toStartOf="@id/img5"
        app:layout_constraintTop_toBottomOf="@id/constraint5" />

    <Button
        android:id="@+id/button1"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        app:layout_constraintWidth_percent="1"
        android:background="#1E8A21"
        android:text="DEPART"
        app:layout_constraintBottom_toBottomOf="@id/constraint1"
        app:layout_constraintStart_toStartOf="@id/constraint1"/>



</androidx.constraintlayout.widget.ConstraintLayout>
```

![image-20251118153647659](https://cdn.jsdelivr.net/gh/klebgh/androidshiyan@shiyan1/%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE%202025-11-18%20153640.png)

三.Android界面组件实验

​	1.Android ListView的用法

​	（1）列表项布局

​		

```java
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="horizontal"
    android:layout_height="80dp"
    android:layout_width="match_parent"
    android:background="@drawable/list_item_selector">

    <!-- 文本控件：占满剩余水平空间 -->
    <TextView
        android:id="@+id/tv_item_text"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:layout_gravity="center_vertical"
        android:layout_marginStart="10dp" />

    <!-- 图片控件：居右显示 -->
    <ImageView
        android:id="@+id/iv_item_icon"
        android:layout_marginEnd="10dp"
        android:layout_gravity="center_vertical"
        android:layout_width="60dp"
        android:layout_height="60dp" />

</LinearLayout>
```

​	列表布局

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:fitsSystemWindows="true">

    <ListView
        android:id="@+id/list_view"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:divider="#000000"
        android:dividerHeight="1dp"
        android:choiceMode="singleChoice"/>

    <Button
        android:id="@+id/selected_btn"
        android:layout_width="160dp"
        android:layout_height="60dp"
        android:layout_gravity="center" />

</LinearLayout>
```

​	

​	（2）Toast功能的实现

​	点击列表项后，会在下方的按钮显示选中的用户名，并弹出提示：选中了：selectedText，selectedText为选中列表项的文本内容。

![屏幕截图 2025-11-18 152413](https://cdn.jsdelivr.net/gh/klebgh/androidshiyan@shiyan1/%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE%202025-11-18%20173712.png)

​	（3）通知功能的实现

​		1.使用`createNotificationChannel()`创建通知渠道

​		2.使用`sendNotification()`构建并发送通知，在sendNotification()中，通过**`PendingIntent.getActivity(...)`**: 创建一个	用于启动 `Activity` 的 `PendingIntent`，再通过NotificationCompat.Builder构建 `Notification` 对象。

​		3.通过notificationManager.notify将构建好的通知发送出去

​	相应代码如下：

```java
public class ListViewActivity extends AppCompatActivity{
    private Button selectedBtn;
    //  定义通知渠道ID
    private static final String CHANNEL_ID = "list_item_notification_channel";
    //定义权限请求码
    private static final int NOTIFICATION_PERMISSION_REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab3_listview);

        ListView listView=findViewById(R.id.list_view);
        selectedBtn = findViewById(R.id.selected_btn);
        createNotificationChannel();
        List<Map<String, Object>> dataList = new ArrayList<>();


        // 列表项1：图标（系统图标）+ 文本（"首页"）
        Map<String, Object> item1 = new HashMap<>();
        item1.put("icon", R.drawable.lion);  // 系统自带首页图标
        item1.put("text", "Lion");
        dataList.add(item1);

        // 列表项2：可继续添加其他项...
        Map<String, Object> item2 = new HashMap<>();
        item2.put("icon", R.drawable.tiger);
        item2.put("text", "Tiger");
        dataList.add(item2);


        Map<String, Object> item3 = new HashMap<>();
        item3.put("icon", R.drawable.monkey);
        item3.put("text", "Monkey");
        dataList.add(item3);

        Map<String, Object> item4 = new HashMap<>();
        item4.put("icon", R.drawable.dog);
        item4.put("text", "Dog");
        dataList.add(item4);

        Map<String, Object> item5 = new HashMap<>();
        item5.put("icon", R.drawable.cat);
        item5.put("text", "Cat");
        dataList.add(item5);

        Map<String, Object> item6 = new HashMap<>();
        item6.put("icon", R.drawable.elephant);
        item6.put("text", "Elephant");
        dataList.add(item6);

        String[] from = {"icon", "text"};
        int[] to = {R.id.iv_item_icon, R.id.tv_item_text};  // 假设列表项布局中有这两个控件

        SimpleAdapter simpleAdapter = new SimpleAdapter(
                this,
                dataList,
                R.layout.lab3_item_simple_adapter,  // 替换为你的列表项布局文件名
                from,
                to
        );

        listView.setAdapter(simpleAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // 获取选中项的文本内容
                String selectedText = dataList.get(position).get("text").toString();

                selectedBtn.setText(selectedText);

                Toast.makeText(ListViewActivity.this, "选中了：" + selectedText, Toast.LENGTH_SHORT).show();

                view.setSelected(true);
                listView.setItemChecked(position, true);

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                    if (ActivityCompat.checkSelfPermission(ListViewActivity.this, android.Manifest.permission.POST_NOTIFICATIONS) == PackageManager.PERMISSION_GRANTED) {
                        sendNotification(selectedText, position); // 传入position
                    } else {
                        ActivityCompat.requestPermissions(ListViewActivity.this, new String[]{android.Manifest.permission.POST_NOTIFICATIONS}, NOTIFICATION_PERMISSION_REQUEST_CODE);
                    }
                } else {
                    sendNotification(selectedText, position); // 传入position
                }
            }
        });

    }
    private void createNotificationChannel() {
        
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            // 渠道名称（用户在系统设置中看到的名称）
            CharSequence channelName = "列表项选中通知";
            
            String channelDescription = "单击列表项时发送的通知，显示选中的列表项内容";
            
            int importance = NotificationManager.IMPORTANCE_DEFAULT;

            
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, channelName, importance);
            channel.setDescription(channelDescription);

            // 获取通知管理器，注册渠道
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }

    
    private void sendNotification(String selectedText, int position) {
        Log.d("NotificationTest", "触发通知，选中项：" + selectedText + "，位置：" + position);

        
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
            Toast.makeText(this, "通知权限未开启", Toast.LENGTH_SHORT).show();
            return;
        }

        // 构建PendingIntent
        PendingIntent pendingIntent = PendingIntent.getActivity(
                this,
                position, 
                getIntent(),
                PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE
        );

        
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this, CHANNEL_ID)
                .setSmallIcon(R.mipmap.ic_launcher) 
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher)) 
                .setContentTitle("选中列表项：" + selectedText)
                .setContentText("已成功选中「" + selectedText + "」，点击返回应用")
                .setPriority(NotificationCompat.PRIORITY_HIGH) // 低版本兼容高优先级
                .setAutoCancel(true)
                .setContentIntent(pendingIntent);

        
        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
        try {
            notificationManager.notify(1000 + position, notificationBuilder.build());
        } catch (SecurityException e) {
            Toast.makeText(this, "通知权限已关闭，请在设置中开启", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }
}

```

​	2.创建自定义布局的AlertDialog

​		布局文件

```java
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp">
    
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="#FFA500"
        android:gravity="center"
        android:padding="12dp">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="ANDROID APP"
            android:textColor="#FFFFFF"
            android:textSize="24sp"
            android:textStyle="bold" />
        </LinearLayout>
    
        <EditText
            android:id="@+id/username_et"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="16dp"
            android:hint="Username"
            android:inputType="text" />
    
        <EditText
            android:id="@+id/password_et"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="8dp"
            android:hint="Password"
            android:inputType="textPassword" />
    
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="24dp"
        android:orientation="horizontal">

        <Button
            android:id="@+id/btn_cancel"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="Cancel" />

        <Button
            android:id="@+id/btn_sign_in"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="Sign in" />


        </LinearLayout>

    </LinearLayout>
```

​	调 用 AlertDialog.Builder 对象上的 setView() 将 布 局 添 加 到AlertDialog

​		1.加载自定义登录布局

​		2.创建AlertDialog.Builder

​		3.为上面布局文件的cancel按钮添加点击事件，使其点击后关闭对话框

​		4.为上面布局文件的sign in按钮添加点击事件，使其点击后弹出输入的用户名和密码并关闭对话框

代码和运行结果如下：

```java
public class AlertDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab3_alertdialogbutton_layout);


        Button showDialogBtn = findViewById(R.id.show_dialog_btn);

        showDialogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1. 加载自定义登录布局
                LayoutInflater inflater = LayoutInflater.from(AlertDialogActivity.this);
                View dialogView = inflater.inflate(R.layout.lab_3_alertdialog_layout, null);

                // 2. 创建AlertDialog.Builder并设置自定义视图
                AlertDialog.Builder builder = new AlertDialog.Builder(AlertDialogActivity.this);
                builder.setTitle("登录"); // 对话框标题
                builder.setView(dialogView); // 将自定义布局设置为对话框内容

                AlertDialog dialog = builder.create();

                Button cancelBtn = dialogView.findViewById(R.id.btn_cancel);
                Button signInBtn = dialogView.findViewById(R.id.btn_sign_in);


                cancelBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // 执行取消逻辑：关闭对话框
                        dialog.dismiss();
                    }
                });
                
                signInBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        EditText usernameEt = dialogView.findViewById(R.id.username_et);
                        EditText passwordEt = dialogView.findViewById(R.id.password_et);
                        String username = usernameEt.getText().toString();
                        String password = passwordEt.getText().toString();

                        Toast.makeText(AlertDialogActivity.this,
                                "用户名：" + username + "，密码：" + password,
                                Toast.LENGTH_SHORT).show();

                        dialog.dismiss();
                    }
                });
                
                dialog.show();
            }
        });
    }
}

```

![image-20251118190704862](https://cdn.jsdelivr.net/gh/klebgh/androidshiyan@shiyan1/%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE%202025-11-18%20190641.png)

​	3.使用XML定义菜单

​		菜单定义

​	

```java
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item
        android:id="@+id/menu_main"
        android:title="选项">
        <menu>
            <item
                android:id="@+id/submenu_option1"
                android:title="字体大小">
                <menu>
                    <item
                        android:id="@+id/smallsize"
                        android:title="小"/>
                    <item
                        android:id="@+id/middlesize"
                        android:title="中"/>
                    <item
                        android:id="@+id/bigsize"
                        android:title="大"/>
                </menu>
            </item>
            <item
                android:id="@+id/submenu_option2"
                android:title="普通菜单项"/>
            <item
                android:id="@+id/submenu_option3"
                android:title="字体颜色">
                <menu>
                    <item
                        android:id="@+id/coloroption1"
                        android:title="红" />
                    <item
                        android:id="@+id/coloroption2"
                        android:title="黑"/>
                </menu>
            </item>
        </menu>
    </item>
</menu>
```

​	相关功能实现

```java
@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId(); // 获取菜单项的ID

        if (itemId == R.id.smallsize) {
            menuTextTest.setTextSize(10);
            Toast.makeText(this, "字体设置为小（10sp）", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.middlesize) {
            menuTextTest.setTextSize(16);
            Toast.makeText(this, "字体设置为中（16sp）", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.bigsize) {
            menuTextTest.setTextSize(20);
            Toast.makeText(this, "字体设置为大（20sp）", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.coloroption1) {
            menuTextTest.setTextColor(getResources().getColor(R.color.red));
            Toast.makeText(this, "字体颜色设置为红色", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.coloroption2) {
            menuTextTest.setTextColor(getResources().getColor(R.color.black));
            Toast.makeText(this, "字体颜色设置为黑色", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.submenu_option2) {
            Toast.makeText(this, "这是普通菜单项", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
```

​	4.创建上下文操作模式(ActionMode)的上下文菜单

​	布局列表文件

```java
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:fitsSystemWindows="true">

    <ListView
        android:id="@+id/list_view"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />

</LinearLayout>
```

​	布局列表项文件

```java
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="horizontal"
    android:layout_height="80dp"
    android:layout_width="match_parent"
    android:background="@drawable/list_contextmenu_selector">
    
    <ImageView
        android:id="@+id/contextmenu_image"
        android:layout_marginStart="10dp"
        android:layout_gravity="center_vertical"
        android:layout_width="60dp"
        android:layout_height="60dp" />
    
    <TextView
        android:id="@+id/contextmenu_text"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:layout_gravity="center_vertical"
        android:layout_marginStart="10dp" />

</LinearLayout>
```

​	

1. 初始化 ListView 基础配置

2. 开启多选模式

3. 配置 ActionMode 回调，ActionMode 是顶部的操作栏，回调里的 5 个方法对应它的生命周期，核心是这 3 个：

   创建时：加载操作栏菜单（比如 “删除” 按钮）；

   选中项变化时：实时更新操作栏标题，显示 “X selected”（X 是选中项数量）；

   点击操作栏按钮时：如果点的是 “删除”，就获取所有选中项的位置，从后往前删除（避免索引混乱），然后刷新列表、关闭操作栏，还会弹 Toast 提示 “已删除选中项”。

4. **收尾处理**

   当 ActionMode 关闭时（onDestroyActionMode），清除 ListView 的选中状态，避免下次打开混乱。

   运行结果如下：

   ![image-20251118192658971](https://cdn.jsdelivr.net/gh/klebgh/androidshiyan@shiyan1/%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE%202025-11-18%20192651.png)

   选中第一第二个列表项

   ![image-20251118192732969](https://cdn.jsdelivr.net/gh/klebgh/androidshiyan@shiyan1/%E5%B1%8F%E5%B9%95%E6%88%AA%E5%9B%BE%202025-11-18%20192727.png)

   点击右上角删除按钮，被选中列表项被删除
