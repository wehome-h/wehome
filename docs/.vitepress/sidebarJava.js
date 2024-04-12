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
                                }
                            ]
                        }
                    ]
                }
            ]
        }
    ]
}