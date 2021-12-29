const path = require('path');
const VueLoaderPlugin = require('vue-loader/lib/plugin');

module.exports = {
    mode: 'development',
    devtool: 'source-map',
    entry: path.join(__dirname, 'src', 'main','webapp', 'resources', 'static', 'js', 'main.js'),
    devServer: {
        compress: true,
        port: 8000,
        allowedHosts: [
            'localhost:9000'
        ]
    },
    module: {
        rules: [
            {
                test: /\.js$/,
                exclude: /(node_modules|bower_components)/,
                use: {
                    loader: 'babel-loader',
                    options: {
                        presets: ['@babel/preset-env']
                    }
                }
            },
            {
                test: /\.(?:ico|gif|png)$/i,
                type: 'asset/resource',
            },
            {
                test: /\.vue$/,
                loader: 'vue-loader'
            },

            {
                test: /\.css$/,
                use: [
                    'vue-style-loader',
                    'css-loader'
                ]
            },

            {
                test: /.(?:ico|gif|png|jpg|jpeg)$/i,
                type: 'asset/resource',
            },


        ]
    },
    plugins: [
        new VueLoaderPlugin()
    ],
    resolve: {
        modules: [
            path.join(__dirname, 'src', 'main', 'webapp','resources', 'static', 'js'),
            path.join(__dirname, 'src', 'main', 'webapp','resources'),
            path.join(__dirname, 'node_modules'),
            path.join(__dirname, 'src', 'images')
        ],
    }
}