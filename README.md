```Requirement```

5 5
1 2 N
LMLMLMLMM
3 3 E
MMRMMRMRRM


期待的输出:

1 3 N
5 1 E



* 不同的方向，会产生不同的行为，用state设计模式，状态对象，封装不同的行为, 方向指令 L（n:w,w:s,s:e,e:n); R (n:e,e:s,s:w,w:n)。

* 增加Rover对象，实现移动功能，并将移动功能的具体实现授权给状态对象。M (w:x - 1, e:x + 1, n:y + 1, s:y - 1)

* 移动范围的控制。

* 用command模式，接受并执行命令列表（turnLeft, turnRight, Move）。

* 异常处理。