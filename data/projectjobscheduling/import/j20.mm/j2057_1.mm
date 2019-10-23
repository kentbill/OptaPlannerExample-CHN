************************************************************************
file with basedata            : md377_.bas
initial value random generator: 12124
************************************************************************
projects                      :  1
jobs (incl. supersource/sink ):  22
horizon                       :  152
RESOURCES
  - renewable                 :  2   R
  - nonrenewable              :  2   N
  - doubly constrained        :  0   D
************************************************************************
PROJECT INFORMATION:
pronr.  #jobs rel.date duedate tardcost  MPM-Time
    1     20      0       17       19       17
************************************************************************
PRECEDENCE RELATIONS:
jobnr.    #modes  #successors   successors
   1        1          3           2   3   4
   2        3          3           6  13  18
   3        3          3           5   7  20
   4        3          2           6  15
   5        3          3          16  17  19
   6        3          3           9  12  20
   7        3          3           8  11  14
   8        3          3           9  12  18
   9        3          1          10
  10        3          1          19
  11        3          3          12  15  16
  12        3          1          19
  13        3          3          15  16  20
  14        3          1          17
  15        3          1          21
  16        3          1          21
  17        3          1          18
  18        3          1          21
  19        3          1          22
  20        3          1          22
  21        3          1          22
  22        1          0        
************************************************************************
REQUESTS/DURATIONS:
jobnr. mode duration  R 1  R 2  N 1  N 2
------------------------------------------------------------------------
  1      1     0       0    0    0    0
  2      1     3       0    4    9    5
         2     6       0    4    7    5
         3     8       0    3    6    2
  3      1     2       7    0    9    4
         2     5       0    2    8    4
         3     7       0    2    6    4
  4      1     1       5    0    8    9
         2     1       0    3    8    7
         3     4       6    0    8    3
  5      1     4       0    3   10    3
         2     5       4    0    8    2
         3     6       4    0    6    2
  6      1     5       7    0    5    5
         2     7       0    5    5    4
         3    10       5    0    5    4
  7      1     2       0   10    6    4
         2     3       0    8    5    4
         3     6       0    6    4    3
  8      1     5       0    7    9   10
         2     9       0    6    9   10
         3    10       0    4    8    9
  9      1     2       9    0    3    2
         2     6       0   10    2    2
         3     8       0    7    2    2
 10      1     1       7    0    8    6
         2     4       0    4    7    5
         3     5       5    0    7    4
 11      1     1       7    0    6    1
         2     3       5    0    5    1
         3     7       0    8    3    1
 12      1     1       3    0    6    7
         2     2       2    0    5    5
         3     4       2    0    4    2
 13      1     1       6    0    4    9
         2     8       0    8    4    8
         3    10       6    0    1    8
 14      1     2       0    8    6   10
         2     6       9    0    3    9
         3     8       6    0    2    9
 15      1     1       0    3    3    3
         2     3       0    2    2    3
         3     9       0    2    2    2
 16      1     1       6    0    8    6
         2    10       4    0    7    5
         3    10       0    4    7    5
 17      1     1       7    0    9   10
         2     2       6    0    9    9
         3     7       4    0    9    7
 18      1     2       9    0    6   10
         2     4       0    9    6   10
         3     4       9    0    4   10
 19      1     3       0    6    7    5
         2     5       4    0    6    4
         3    10       0    6    6    2
 20      1     5       9    0    8    9
         2    10       4    0    5    7
         3    10       0    3    5    6
 21      1     6       7    0    8    8
         2     7       6    0    8    7
         3     9       0    5    8    7
 22      1     0       0    0    0    0
************************************************************************
RESOURCEAVAILABILITIES:
  R 1  R 2  N 1  N 2
   11   14  138  126
************************************************************************
