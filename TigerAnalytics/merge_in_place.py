def merge_sort_inplace(nums1, m, nums2, n):
    i1, i2 = 0, 0
    while i2 != n:
        if nums1[i1] >= nums2[i2] or i1 > m+i2-1:
            nums1[i1+1:] = nums1[i1:-1]
            nums1[i1] = nums2[i2]
            i2 += 1
            i1 += 1
        else:
            i1 += 1
    return nums1


if __name__ == "__main__":
    nums1 = [-1, 0, 9, 0, 0, 0]
    m = 3
    nums2 = [3, 7, 8]
    n = 3
    result = merge_sort_inplace(nums1, m, nums2, n)
    print(result)
