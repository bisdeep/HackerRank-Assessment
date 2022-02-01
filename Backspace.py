def backspaceCompare(s1, s2):
        s1_stack = []
        s2_stack = []
        for c in s1:
            if c == '#' and s1_stack:
                # if char is # and the stack isn't empty...
                s1_stack.pop()
                continue
            if c != '#': s1_stack.append(c)

        for c in s2:
            if c == '#' and s2_stack:
                # if char is # and the stack isn't empty...
                s2_stack.pop()
                continue
            if c != '#': s2_stack.append(c)
        return s1_stack == s2_stack

s1 = "ab##"
s2 = "c#d#"

print(backspaceCompare(s1, s2))

t1 = "ab#c"
t2 = "ad#c"

print(backspaceCompare(t1, t2))

d1 = "ab##c"
d2 = "ad#c"

print(backspaceCompare(d1, d2))