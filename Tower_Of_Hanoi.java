class Solution {
	int count;
	public void hanoi(int n, int source, int helper, int destination) {
		if (n == 0)return;
		hanoi(n - 1, source, destination, helper);
		count++;
		hanoi(n - 1, helper, source, destination);
	}
	public int towerOfHanoi(int n, int from, int to, int aux) {
		// code here
		count = 0;
		hanoi(n, from, aux, to);
		return count;
	}
}
