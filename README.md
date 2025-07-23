# 🅰️ Vowel & Consonant Counter – Java Project

A simple Java program that takes a user input (a string), removes all spaces, and then counts the **vowels** and **consonants** in it.

---

## 🔧 How It Works

1. User enters a string.
2. All spaces are removed.
3. Each character is checked:
   - If it's a vowel (`a, e, i, o, u`), it's added to the vowel count.
   - Else, it's considered a consonant.

⚠️ Currently the program only works for **lowercase letters** and **doesn't check for punctuation or numbers**.

---

## 💻 Code

```java
import java.util.*;

public class count_consonent_n_vowel {
    public static void main() {
        System.out.print(" ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replace(" ", "");
        int l = s.length();
        int j = 0, e = 0, i;

        String a = "aeiou";
        for (i = 0; i < l; i++) {
            char c = s.charAt(i);
            if (a.indexOf(c) > 0) {
                j++;
            } else {
                e++;
            }
        }
        System.out.print("c=" + j + "v=" + e);
    }
}
