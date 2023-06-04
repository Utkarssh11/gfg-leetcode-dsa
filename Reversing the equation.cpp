GFG
Reversing the equation

class Solution {
public:
    string reverseEqn(string s) {
        string reversed;
        int equationStart = s.length() - 1;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s[i] == '+' || s[i] == '-' || s[i] == '*' || s[i] == '/') {
                reversed += s.substr(i + 1, equationStart - i) + s[i];
                equationStart = i - 1;
            }
        }

        reversed += s.substr(0, equationStart + 1);

        return reversed;
    }
};
