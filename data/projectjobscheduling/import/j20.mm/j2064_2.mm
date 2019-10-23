************************************************************************
file with basedata            : md384_.bas
initial value random generator: 1012323382
************************************************************************
projects                      :  1
jobs (incl. supersource/sink ):  22
horizon                       :  168
RESOURCES
  - renewable                 :  2   R
  - nonrenewable              :  2   N
  - doubly constrained        :  0   D
************************************************************************
PROJECT INFORMATION:
pronr.  #jobs rel.date duedate tardcost  MPM-Time
    1     20      0       23        4       23
************************************************************************
PRECEDENCE RELATIONS:
jobnr.    #modes  #successors   successors
   1        1          3           2   3   4
   2        3          3           5   7   8
   3        3          3           6   9  11
   4        3          2          10  12
   5        3          3          13  16  21
   6        3          3           8  13  16
   7        3          3           9  18  19
   8        3          1          14
   9        3          2          14  20
  10        3          1          14
  11        3          3          12  15  16
  12        3          3          19  20  21
  13        3          2          15  17
  14        3          1          21
  15        3          1          19
  16        3          1          17
  17        3          1          18
  18        3          1          20
  19        3          1          22
  20        3          1          22
  21        3          1          22
  22        1          0        
************************************************************************
REQUESTS/DURATIONS:
jobnr. mode duration  R 1  R 2  N 1  N 2
------------------------------------------------------------------------
  1      1     0       0    0    0    0
  2      1     2       6    6    9    6
         2     6       5    4    9    6
         3    10       5    3    8    4
  3      1     5       7    2    9    8
         2     6       5    2    9    7
         3     9       3    1    9    2
  4      1     2       3    5    8    5
         2     4       3    5    6    4
         3    10       2    5    5    3
  5      1     7       9    2    2    6
         2     9       9    2    1    4
         3    10       8    2    1    4
  6      1     1       6    6    8    3
         2     2       5    6    8    3
         3     4       2    5    8    2
  7      1     5       5    9    8    8
         2     9       4    6    4    7
         3    10       3    3    3    7
  8      1     1       9    3    4    9
         2     2       7    3    4    9
         3     3       5    2    3    8
  9      1     4       7    9    4    6
         2     7       6    9    3    5
         3     9       1    8    3    5
 10      1     2       9   10    4    3
         2     8       8    9    2    3
         3     8       6    7    3    3
 11      1     1       2    7    7    3
         2     8       2    7    6    3
         3     9       1    5    5    2
 12      1     2       6    7    7    7
         2     5       5    5    5    4
         3     9       5    1    5    2
 13      1     1       7    5    6    4
         2     4       7    4    6    3
         3     9       6    4    6    2
 14      1     3       9    9    7   10
         2     6       9    7    6    9
         3     9       7    4    3    9
 15      1     2       6    6    9    2
         2     9       5    5    9    2
         3    10       2    4    8    2
 16      1     4       2    6    4    7
         2     7       1    5    4    6
         3    10       1    4    2    5
 17      1     1       8    3    1    3
         2     3       8    3    1    2
         3     9       8    3    1    1
 18      1     2       9    7   10    8
         2     4       9    4    9    6
         3     5       6    1    9    4
 19      1     3       7    2    5    9
         2     3       7    2    6    8
         3     8       5    2    5    5
 20      1     1      10    6    6    8
         2     1       9    6    6    9
         3     7       7    4    6    3
 21      1     9      10    8    3    4
         2     9      10    6    4    4
         3    10      10    5    3    4
 22      1     0       0    0    0    0
************************************************************************
RESOURCEAVAILABILITIES:
  R 1  R 2  N 1  N 2
   30   24  123  120
************************************************************************
