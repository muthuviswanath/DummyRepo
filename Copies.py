a = 10
b = a

print(f"{a = }")
print(f"{b = }")

print(f"memorylocation:{id(a)}")
print(f"memorylocation:{id(b)}")
b = 40
print(f"{a = } {b = }")
