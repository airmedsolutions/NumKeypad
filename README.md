# NumKeypad
A custom numeric keypad

To get a Git project into your build:

**Step 1:** Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:

```
  allprojects {
    repositories {
      ...
      maven { url 'https://jitpack.io' }
    }
  }
  
```

**Step 2:** Add the dependency
```
  dependencies {
    implementation 'com.github.airmedsolutions:NumKeypad:1.0.0'
  }
```

**How to use?***

In XML layout:
```
<com.myairmed.numkeypad.NumKeypad
  android:id="@+id/keyboard"
  android:layout_width="match_parent"
  android:layout_height="wrap_content"
  app:field="@id/et_otp"
  app:keyTextColor="@color/colorPrimary"
  app:keyTextSize="16sp" />
```
**Attriutes and their Use:**
<table>
  <tr>
    <th>Attriutes</th>
    <th>Use</th>
  </tr>
  <tr>
    <td>app:field</td>
    <td>Reference to the <b><i>EditText</i></b> which will take user input</td>
  </tr>
  <tr>
    <td>app:fieldMaxLength</td>
    <td><b><i>maxLength</i></b> of the bound <b><i>EditText</i></b>, if it has one</td>
  </tr>
  <tr>
    <td>app:keyHeight</td>
    <td>Height for all keyboard's keys</td>
  </tr>
  <tr>
    <td>app:keyTextColor</td>
    <td>Text color of a key</td>
  </tr>
  <tr>
    <td>app:keyTextSize</td>
    <td>Text size of a key</td>
  </tr>
  <tr>
    <td>app:keySpecial</td>
    <td>Right bottom key on the keyboard (disabled by default, see details in javadoc)</td>
  </tr>
</table>

**Note:** If your ```EditText``` has **android:maxLength** attribute but you haven't provide **app:fieldMaxLength** for the keyboard, a ```TextWatcher``` for that ```EditText``` will be called even when user taps on a key after reaching the max length.
