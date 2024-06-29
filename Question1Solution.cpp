#include <iostream>
#include <unordered_map>
using namespace std;

char firstRepeatedCharacter(const string &str) {
    unordered_map<char, int> charCount;
    for (char ch : str) {
        charCount[ch]++;
        if (charCount[ch] > 1) {
            return ch;
        }
    }
    return '\0';
}

int main() {
    string str = "hello";
    char result = firstRepeatedCharacter(str);
    if (result != '\0') {
        cout << "First repeated character: " << result << endl;
    } else {
        cout << "No repeated characters found." << endl;
    }
    return 0;
}
