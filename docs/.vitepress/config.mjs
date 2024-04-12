import {defineConfig} from 'vitepress'

import nav from './nav'

import sidebarJava from './sidebarJava'
import sidebarPython from './sidebarPython'
import sidebarWeb from './sidebarWeb'

import search from './search'

// https://vitepress.dev/reference/site-config
export default defineConfig({
    lang: 'zh-CN',
    title: "wehome",
    description: "我亦无他，惟手熟尔",
    head: [['link', {rel: 'icon', href: 'favicon.ico'}]],
    base: '/wehome/',
    cleanUrls: true,
    srcExclude: ['**/README.md'],
    themeConfig: {
        // https://vitepress.dev/reference/default-theme-config
        logo: '/wehome.jpg',

        nav: nav(),

        sidebar: {
            '/Java/': {base: '/Java/', items: sidebarJava()},
            '/Python/': {base: '/Python/', items: sidebarPython()},
            '/Web/': {base: '/Web/', items: sidebarWeb()}
        },

        search,

        docFooter: {
            prev: '上一页',
            next: '下一页'
        },

        outline: {
            label: '页面导航'
        },

        i18nRouting: false,

        socialLinks: [
            {icon: 'github', link: 'https://github.com/wehome-h'}
        ],

        langMenuLabel: '多语言',
        returnToTopLabel: '回到顶部',
        sidebarMenuLabel: '菜单',
        darkModeSwitchLabel: '主题',
        lightModeSwitchTitle: '切换到浅色模式',
        darkModeSwitchTitle: '切换到深色模式'
    }
})