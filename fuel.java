/*## **Problem Statement**
Vijay, an industrialist, recently opened a **fuel industry** with `N` different **categories of fuel**, each stored in **fixed-size containers**.  
Each fuel container has:
- A **price** (cost to buy).
- A **volume** (fuel it holds).

Hari, a **fuel merchant**, has a **limited budget `K`** and wants to **buy fuel to maximize the total volume**.  
Hari **cannot buy more than one container** of any fuel category.

Find the **maximum overall volume of fuel** that Hari can purchase within his budget `K`.*/

import java.util.*;

public class fuel {

    public static int getMaxVolume(int N, int K, int[] prices, int[] volumes) {
        int[] fuel = new int[K + 1];

        for (int i = 0; i < N; i++) {
            for (int j = K; j >= prices[i]; j--) {
                fuel[j] = Math.max(fuel[j], fuel[j - prices[i]] + volumes[i]);
            }
        }

        return fuel[K];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] prices = new int[N];
        int[] volumes = new int[N];

        for (int i = 0; i < N; i++) prices[i] = sc.nextInt();
        for (int i = 0; i < N; i++) volumes[i] = sc.nextInt();

        int result = getMaxVolume(N, K, prices, volumes);
        System.out.println(result);
    }
}