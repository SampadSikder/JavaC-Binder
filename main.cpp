#include <iostream>
#include <windows.h>
using namespace std;

int main(int argc, char *argv[])
{
    //int x, y;
    int x = atoi(argv[1]);
    int y = atoi(argv[2]);
    //cin >> x >> y;
    int vector[2][1] = {{x},
                        {y}};
    int fib[2][2] = {{1, 1}, {1, 0}};
    int result[2][1];

    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 1; j++)
        {
            result[i][j] = 0;
            for (int k = 0; k < 2; k++)
            {
                result[i][j] += fib[i][k] * vector[k][j];
            }
        }
    }
    cout << result[0][0] << "," << result[1][0] << endl;

    return 0;
}
