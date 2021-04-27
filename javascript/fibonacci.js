const fibonacci = n => {
    if (n > 2) return fibonacci(n-1) + fibonacci(n-2);
    if (n === 2 || n === 1) return 1;
    return 0;
};