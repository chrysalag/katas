/* 
    Given two arrays a and b write a function comp(a, b) that checks whether the two arrays have the "same" elements, with the same multiplicities. 
    "Same" means, here, that the elements in b are the elements in a squared, regardless of the order.
*/

function comp(array1, array2) {
    if (array1 == null || array2 == null) return false;
    return array1.map(el => el**2).sort().toString() == array2.sort().toString();
}