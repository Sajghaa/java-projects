# Swapping Numbers without a Third Variable

**I've tried to explain that with comments in the program so there is no nee to write the long readme**

## Understanding the variable of the  program
- a = 10;
- b = 20;

### Swapping formula I used 

```bash
- a =  a + b; // 10 + 20 = 30
- b =  a - b; // 10 - 20 = 10
- a =  a - b; // 30 - 10 = 20 
```

### Swapping formula 2 by using xor
```bash
- a =  a ^ b;
- b =  a ^ b;
- a =  a ^ b;
