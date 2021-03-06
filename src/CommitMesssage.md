# Commit message 的格式

每次提交，Commit message 都包括三个部分：header，body 和 footer。
```
<type>(<scope>): <subject>
<BLANK LINE>
<body>
<BLANK LINE>
<footer>
```
其中，header 是必需的，body 和 footer 可以省略。
不管是哪一个部分，任何一行都不得超过72个字符（或100个字符）。这是为了避免自动换行影响美观。
标题

Header部分只有一行，包括三个字段： type（必需）、 scope（可选）和 subject（必需）。
类型

用于说明 commit 的类别，只允许使用下面7个标识。

    feat：新功能（feature）

    fix：修补bug

    docs：文档（documentation）

    style： 格式（不影响代码运行的变动）

    refactor：重构（即不是新增功能，也不是修改bug的代码变动）

    test：增加测试

    chore：构建过程或辅助工具的变动

如果type为 feat和 fix，则该 commit 将肯定出现在 Change log 之中。其他情况（ docs、 chore、 style、 refactor、 test）由你决定，要不要放入 Change log，建议是不要。
范围

scope用于说明 commit 影响的范围，比如数据层、控制层、视图层等等，视项目不同而不同。

例如在 Angular，可以是 $location, $browser, $compile, $rootScope, ngHref, ngClick, ngView等。

如果你的修改影响了不止一个 scope，你可以使用 *代替。
主题

subject是 commit 目的的简短描述，不超过50个字符。

其他注意事项：

    以动词开头，使用第一人称现在时，比如change，而不是changed或changes

    第一个字母小写

    结尾不加句号（.）
