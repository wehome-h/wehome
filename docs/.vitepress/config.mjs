import { defineConfig } from 'vitepress'

import nav from './nav'

import sidebarJava from './sidebarJava'
import sidebarPython from './sidebarPython'
import sidebarWeb from './sidebarWeb'

import search from './search'

// https://vitepress.dev/reference/site-config
export default defineConfig({
  lang: 'zh-CN',
  title: 'wehome',
  description: '我亦无他，惟手熟尔',
  head: [['link', { rel: 'icon', href: '/favicon.ico' }]],
  base: '/wehome/',
  cleanUrls: true,
  srcExclude: ['**/README.md'],
  markdown: {
    lineNumbers: true,
    math: true
  },
  themeConfig: {
    // https://vitepress.dev/reference/default-theme-config
    logo: '/wehome.jpg',

    nav: nav(),

    sidebar: {
      '/Java/': { base: '/Java/', items: sidebarJava() },
      '/Python/': { base: '/Python/', items: sidebarPython() },
      '/Web/': { base: '/Web/', items: sidebarWeb() }
    },

    search,

    footer: {
      // message: '基于 MIT 许可发布',
      // copyright: `版权所有 © 2019-${new Date().getFullYear()} 尤雨溪`
      message: 'wehome',
      copyright: formatDate()
    },

    docFooter: {
      prev: '上一页',
      next: '下一页'
    },

    outline: {
      level: 'deep',
      label: '页面导航'
    },

    i18nRouting: false,

    socialLinks: [{ icon: 'github', link: 'https://github.com/wehome-h' }],

    langMenuLabel: '多语言',
    returnToTopLabel: '回到顶部',
    sidebarMenuLabel: '菜单',
    darkModeSwitchLabel: '主题',
    lightModeSwitchTitle: '切换到浅色模式',
    darkModeSwitchTitle: '切换到深色模式'
  }
})

function formatDate() {
  const date = new Date()
  const year = date.getFullYear()
  let month = date.getMonth() + 1
  let day = date.getDate()

  if (month < 10) {
    month = '0' + month
  }

  if (day < 10) {
    day = '0' + day
  }

  return `${year}-${month}-${day}`
}
