# cook your dish here
mod = 998244353

for _ in range(int(input())):
	n = int(input())
	a = list(map(int, input().split()))
	ans = pref = 0
	psum = psum2 = psum3 = 0
	for i in range(n):
		pref += a[i]
		
		ans += (i+1)*(pref ** 3)
		ans -= psum3
		ans -= 3*(pref ** 2)*psum
		ans += 3*pref*psum2
		ans %= mod

		psum += pref
		psum2 += pref ** 2
		psum3 += pref ** 3
	print(ans)