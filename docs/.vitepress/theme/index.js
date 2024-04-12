import DefaultTheme from 'vitepress/theme'
import { onMounted, watch, nextTick } from 'vue'
import { useRoute } from 'vitepress'
import mediumZoom from 'medium-zoom'

import './index.css'

export default {
    ...DefaultTheme,

    setup() {
        const route = useRoute()
        const initZoom = () => {
            // new mediumZoom('[data-zoomable]', { background: 'rgba(0, 0, 0, 0.7)' }) // Should there be a new?
            new mediumZoom('.main img', { background: 'rgba(0, 0, 0, 0.7)' });
            // new mediumZoom('.main img', { background: 'var(--vp-c-bg)' });
        }
        onMounted(() => {
            initZoom()
        })
        watch(
            () => route.path,
            () => nextTick(() => initZoom())
        )
    },
}
