#include <iostream>
#include <unordered_map>
#include <vector>
using namespace std;

bool areArraysEqual(const vector<int> &arr1, const vector<int> &arr2) {
    if (arr1.size() != arr2.size()) {
        return false;
    }
    unordered_map<int, int> elementCount;
    for (int num : arr1) {
        elementCount[num]++;
    }
    for (int num : arr2) {
        if (elementCount.find(num) == elementCount.end() || elementCount[num] == 0) {
            return false;
        }
        elementCount[num]--;
    }
    return true;
}

int main() {
    vector<int> arr1 = {1, 2, 3, 4};
    vector<int> arr2 = {4, 3, 2, 1};
    if (areArraysEqual(arr1, arr2)) {
        cout << "Arrays are equal." << endl;
    } else {
        cout << "Arrays are not equal." << endl;
    }
    return 0;
}
