"""
    461. Hamming Distance
"""
class Solution:
    def hammingDistance(self, x: int, y: int) -> int:
        return bin(x ^ y).count('1')

"""
    - 32 ms	14.3 MB
"""