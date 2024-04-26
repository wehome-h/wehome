export default () => {
  return [
    {
      text: 'Java',
      base: '/Java/',
      link: 'index',
      items: [
        {
          text: 'Java 基础',
          base: '/Java/P1-Java%20基础/',
          link: 'index',
          collapsed: true,
          items: [
            {
              text: '第一章 Java 语言概述',
              base: '/Java/P1-Java%20基础/P1-第一章%20Java%20语言概述/',
              link: 'index',
              collapsed: true,
              items: [
                {
                  text: '第一节 什么是程序',
                  link: 'P1-第一节%20什么是程序'
                },
                {
                  text: '第二节 Java 历史',
                  link: 'P2-第二节%20Java%20历史'
                },
                {
                  text: '第三节 Java 技术体系平台',
                  link: 'P3-第三节%20Java%20技术体系平台'
                },
                {
                  text: '第四节 Java 语言重要特点',
                  link: 'P4-第四节%20Java%20语言重要特点'
                },
                {
                  text: '第五节 Java 运行机制及运行过程',
                  link: 'P5-第五节%20Java%20运行机制及运行过程'
                },
                {
                  text: '第六节 什么是 JDK、JRE',
                  link: 'P6-第六节%20什么是%20JDK、JRE'
                },
                {
                  text: '第七节 下载、安装 JDK',
                  link: 'P7-第七节%20下载、安装%20JDK'
                },
                {
                  text: '第八节 配置环境变量 path',
                  link: 'P8-第八节%20配置环境变量%20path'
                },
                {
                  text: '第九节 Java 快速入门',
                  link: 'P9-第九节%20Java%20快速入门'
                },
                {
                  text: '第十节 Java 转义字符',
                  link: 'P10-第十节%20Java%20转义字符'
                },
                {
                  text: '第十一节 初学 Java 易犯错误',
                  link: 'P11-第十一节%20初学%20Java%20易犯错误'
                },
                {
                  text: '第十二节 注释',
                  link: 'P12-第十二节%20注释'
                },
                {
                  text: '第十三节 Java 代码规范',
                  link: 'P13-第十三节%20Java%20代码规范'
                },
                {
                  text: '第十四节 DOS 命令',
                  link: 'P14-第十四节 DOS 命令'
                }
              ]
            },
            {
              text: '第二章 变量',
              base: '/Java/P1-Java%20基础/P2-第二章%20变量/',
              link: 'index',
              collapsed: true,
              items: [
                {
                  text: '第一节 关键字',
                  link: 'P1-第一节%20关键字'
                },
                {
                  text: '第二节 标识符',
                  link: 'P2-第二节%20标识符'
                },
                {
                  text: '第三节 变量',
                  link: 'P3-第三节%20变量'
                },
                {
                  text: '第四节 基本数据类型介绍',
                  link: 'P4-第四节%20基本数据类型介绍',
                  collapsed: true,
                  items: [
                    {
                      text: '第一点 整数类型',
                      link: 'P4-1-第一点%20整数类型'
                    },
                    {
                      text: '第二点 浮点类型',
                      link: 'P4-2-第二点%20浮点类型'
                    },
                    {
                      text: '第三点 字符串类型',
                      link: 'P4-3-第三点%20字符串类型'
                    },
                    {
                      text: '第四点 布尔类型',
                      link: 'P4-4-第四点%20布尔类型'
                    }
                  ]
                },
                {
                  text: '第五节 基本数据类型变量间运算规则',
                  link: 'P5-第五节%20基本数据类型变量间运算规则',
                  collapsed: true,
                  items: [
                    {
                      text: '第一点 自动类型提升',
                      link: 'P5-1-第一点%20自动类型提升'
                    },
                    {
                      text: '第二点 强制类型转换',
                      link: 'P5-2-第二点强制类型转换'
                    },
                    {
                      text: '第三点 基本数据类型与 String 的运算',
                      link: 'P5-3-第三点%20基本数据类型与%20String%20的运算'
                    }
                  ]
                },
                {
                  text: '第六节 进制',
                  link: 'P6-第六节%20进制'
                },
                {
                  text: '第七节 运算符',
                  link: 'P7-第七节%20运算符',
                  collapsed: true,
                  items: [
                    {
                      text: '第一点 运算符的分类',
                      link: 'P7-1-第一点%20运算符的分类'
                    },
                    {
                      text: '第二点 算术运算符',
                      link: 'P7-2-第二点%20算术运算符'
                    },
                    {
                      text: '第三点 赋值运算符',
                      link: 'P7-3-第三点%20赋值运算符'
                    },
                    {
                      text: '第四点 比较（关系）运算符',
                      link: 'P7-4-第四点%20比较（关系）运算符'
                    },
                    {
                      text: '第五点 逻辑运算符',
                      link: 'P7-5-第五点%20逻辑运算符'
                    },
                    {
                      text: '第六点 位运算符',
                      link: 'P7-6-第六点%20位运算符'
                    },
                    {
                      text: '第七点 条件运算符',
                      link: 'P7-7-第七点%20条件运算符'
                    },
                    {
                      text: '第八点 运算符优先级',
                      link: 'P7-8-第八点%20运算符优先级'
                    }
                  ]
                },
                {
                  text: '第八节 关于字符集',
                  link: 'P8-第八节%20关于字符集'
                }
              ]
            },
            {
              text: '第三章 流程控制语句',
              base: '/Java/P1-Java%20基础/P3-第三章%20流程控制语句/',
              link: 'index',
              collapsed: true,
              items: [
                {
                  text: '第一节 流程控制语句简介',
                  link: 'P1-第一节%20流程控制语句简介'
                },
                {
                  text: '第二节 顺序结构',
                  link: 'P2-第二节%20顺序结构'
                },
                {
                  text: '第三节 分支语句',
                  link: 'P3-第三节%20分支语句',
                  collapsed: true,
                  items: [
                    {
                      text: '第一点 if-else 条件判断结构',
                      link: 'P3-1-第一点%20if-else%20条件判断结构'
                    },
                    {
                      text: '第二点 switch-case 选择结构',
                      link: 'P3-2-第二点%20switch-case%20选择结构'
                    }
                  ]
                },
                {
                  text: '第四节 循环语句',
                  link: 'P4-第四节%20循环语句',
                  collapsed: true,
                  items: [
                    {
                      text: '第一点 for 循环',
                      link: 'P4-1-第一点%20for%20循环'
                    },
                    {
                      text: '第二点 while 循环',
                      link: 'P4-2-第二点%20while%20循环'
                    },
                    {
                      text: '第三点 do-while 循环',
                      link: 'P4-3-第三点%20do-while%20循环'
                    },
                    {
                      text: '第四点 对比三种循环结构',
                      link: 'P4-4-第四点%20对比三种循环结构'
                    },
                    {
                      text: '第五点 无限循环',
                      link: 'P4-5-第五点%20无限循环'
                    },
                    {
                      text: '第六点 嵌套循环（多重循环）',
                      link: 'P4-6-第六点%20嵌套循环'
                    }
                  ]
                },
                {
                  text: '第五节 break 和 continue 的使用',
                  link: 'P5-第五节%20break%20和%20continue%20的使用'
                },
                {
                  text: '第六节 Scanner 键盘输入功能的实现',
                  link: 'P6-第六节%20Scanner%20键盘输入功能的实现'
                },
                {
                  text: '第七节 如何获取一个随机数',
                  link: 'P7-第七节%20如何获取一个随机数'
                }
              ]
            },
            {
              text: '第四章 IDEA 的安装与使用',
              base: '/Java/P1-Java%20基础/P4-第四章%20IDEA%20的安装与使用/',
              link: 'index',
              collapsed: true,
              items: [
                {
                  text: '第一节 IDEA 的安装与使用（上）',
                  link: 'P1-第一节%20IDEA%20的安装与使用（上）'
                },
                {
                  text: '第二节 IDEA 的安装与使用（下）',
                  link: 'P2-第二节%20IDEA%20的安装与使用（下）'
                }
              ]
            },
            {
              text: '第五章 数组',
              base: '/Java/P1-Java%20基础/P5-第五章%20数组/',
              link: 'index',
              collapsed: true,
              items: [
                {
                  text: '第一节 数组的概述',
                  link: 'P1-第一节%20数组的概述'
                },
                {
                  text: '第二节 一维数组的使用',
                  link: 'P2-第二节%20一维数组的使用'
                },
                {
                  text: '第三节 一维数组内存分析',
                  link: 'P3-第三节%20一维数组内存分析'
                },
                {
                  text: '第四节 一维数组的应用',
                  link: 'P4-第四节%20一维数组的应用'
                },
                {
                  text: '第五节 多维数组的使用',
                  link: 'P5-第五节%20多维数组的使用'
                },
                {
                  text: '第六节 数组的常见算法',
                  link: 'P6-第六节%20数组的常见算法'
                },
                {
                  text: '第七节 Arrays 工具类的使用',
                  link: 'P7-第七节%20Arrays%20工具类的使用'
                },
                {
                  text: '第八节 数组中的常见异常',
                  link: 'P8-第八节%20数组中的常见异常'
                }
              ]
            },
            {
              text: '第六章 面向对象编程（基础）',
              base: '/Java/P1-Java%20基础/P6-第六章%20面向对象编程（基础）/',
              link: 'index',
              collapsed: true,
              items: [
                {
                  text: '第一节 面向对象编程概述',
                  link: 'P1-第一节%20面向对象编程概述'
                },
                {
                  text: '第二节 类和对象',
                  link: 'P2-第二节%20类和对象'
                },
                {
                  text: '第三节 对象的内存解析',
                  link: 'P3-第三节%20对象的内存解析'
                },
                {
                  text: '第四节 成员变量（field）',
                  link: 'P4-第四节%20成员变量（field）'
                },
                {
                  text: '第五节 方法（method）',
                  link: 'P5-第五节%20方法（method）'
                },
                {
                  text: '第六节 对象数组',
                  link: 'P6-第六节%20对象数组'
                },
                {
                  text: '第七节 再谈方法',
                  link: 'P7-第七节%20再谈方法'
                },
                {
                  text: '第八节 package、import',
                  link: 'P8-第八节%20package、import'
                },
                {
                  text: '第九节 封装性',
                  link: 'P9-第九节%20封装性'
                },
                {
                  text: '第十节 构造器',
                  link: 'P10-第十节%20构造器'
                },
                {
                  text: '第十一节 阶段性知识补充',
                  link: 'P11-第十一节%20阶段性知识补充'
                }
              ]
            },
            {
              text: '第七章 面向对象编程（进阶）',
              base: '/Java/P1-Java%20基础/P7-第七章%20面向对象编程（进阶）/',
              link: 'index',
              collapsed: true,
              items: [
                {
                  text: '第一节 this',
                  link: 'P1-第一节%20this'
                }
              ]
            }
          ]
        }
      ]
    }
  ]
}
