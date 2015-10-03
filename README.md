# Prime Number Game Assignment (More button, basic event handling, and toasts)
primenumbergame-rybackpo created by Classroom for GitHub

This assignment illustrates the usage of a simple Buttons and basic Event handling. It also introduces the application of toasts for user feedback.

## Problem:

Design and implement an Android game application that displays a random number (2 to 999) and lets the user guess whether that number is Prime or Composite. A correct answer is rewarded with +1 points while the incorrect answer is penalized with -5 points. Display the current score in a TextView. Provide feedback to the user after his/her answer using a Toast. 

## Basig Game Scoring Logic:

When clicked the Prime Button

```Java
        if(isComposite()){
            score-=5;
            Toast.makeText(this, "It is Incorrect!", Toast.LENGTH_SHORT).show();
        }
        else{
            score++;
            Toast.makeText(this, "Great Job! It is Correct!", Toast.LENGTH_SHORT).show();
        }
```
When clicked the Composite Button

```Java
        if(isComposite()){
            score++;
            Toast.makeText(this, "Great Job! It is Correct!", Toast.LENGTH_SHORT).show();
        }
        else{
            score-=5;
            Toast.makeText(this, "It is Incorrect!", Toast.LENGTH_SHORT).show();
        }
```
## Sample Solution:

https://github.com/DeLaSalleUniversity-Manila/primenumbergame-rybackpo

## Keypoints:

In the MainActivity.java:
```Java
public class MainActivity extends AppCompatActivity {

    private int number;
    private int score = 0;
    private TextView scorecount;

    private void displayNumber(){
        #TODO
    }
    private boolean isComposite(){
        #TODO
    }
    public void ClickonPrime(View view){
        #TODO
    }
    public void ClickonComposite(View view){
        #TODO
    }
}
...
```

In the layout xml file, the Buttons are arranged horizontally using Linear Layout:
```xml
    <LinearLayout
        android:id="@+id/buttons"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:layout_below="@id/numbertext">

        <Button
            android:id="@+id/primebutton"
            android:text="@string/prime"
            android:textSize="20sp"
            android:layout_centerHorizontal="true"
            android:layout_width="wrap_content"
            android:layout_weight="2"
            android:layout_height="100sp"
            android:layout_marginTop="20sp"
            android:onClick="ClickonPrime" />

        <Button
            android:id="@+id/compositebutton"
            android:text="@string/composite"
            android:textSize="20sp"
            android:layout_centerHorizontal="true"
            android:layout_width="wrap_content"
            android:layout_weight="1"
            android:layout_height="100sp"
            android:orientation="horizontal"
            android:layout_marginTop="20sp"
            android:onClick="ClickonComposite" />

    </LinearLayout>
```

## Screenshots:

![alt tag](https://github.com/DeLaSalleUniversity-Manila/primenumbergame-rybackpo/blob/master/device-2015-10-02-210555.png)

![alt tag](https://github.com/DeLaSalleUniversity-Manila/primenumbergame-rybackpo/blob/master/device-2015-10-02-210439.png)

![alt tag](https://github.com/DeLaSalleUniversity-Manila/primenumbergame-rybackpo/blob/master/device-2015-10-02-210434.png)

![alt tag](https://github.com/DeLaSalleUniversity-Manila/primenumbergame-rybackpo/blob/master/device-2015-10-02-210526.png)

![alt tag](https://github.com/DeLaSalleUniversity-Manila/primenumbergame-rybackpo/blob/master/device-2015-10-02-210517.png)

![alt tag](https://github.com/DeLaSalleUniversity-Manila/primenumbergame-rybackpo/blob/master/device-2015-10-02-210732.png)
