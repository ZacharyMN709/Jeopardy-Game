import csv
import os
import os.path
import sys

fname = input("Please input the file path or name: ")
questions = []
with open(fname, 'r') as f:
    reader = csv.reader(f)
    reader = list(reader)
    questions = reader[1:]

for x in questions:
    for y in range(5):
        category = x[1]
        points = x[2]
        question = x[3] + str(y)
        answer = x[4] + str(y)
        cwd = os.getcwd()
        d = os.path.join(cwd, category, points, answer)
        with open(d+'.txt', 'w') as f:
            f.write(answer + '\n' + question)
