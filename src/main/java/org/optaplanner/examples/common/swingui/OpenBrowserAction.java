/*
 * Copyright 2014 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaplanner.examples.common.swingui;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

public class OpenBrowserAction extends AbstractAction {

    private final URI uri;

    public OpenBrowserAction(String title, String urlString) {
        super(title);
        try {
            uri = new URI(urlString);
        } catch (URISyntaxException e) {
			throw new IllegalStateException("创建URI失败 ("/* " Failed creating URI for urlString (" */ + urlString + ").", e);
        }
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop == null || !desktop.isSupported(Desktop.Action.BROWSE)) {
			JOptionPane.showMessageDialog(null, "无法启动浏览.器"/* "Cannot open a browser automatically." */
					+ "\n请手动打开此RUL:\n"/* "\nPlease open this url manually:\n" */ + uri.toString(),
                    "无法打开浏览器"/*"Cannot open browser"*/, JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        try {
            desktop.browse(uri);
        } catch (IOException e) {
            throw new IllegalStateException("无法在默认浏览器中打开链接(" + uri + ")."/*"Failed showing uri (" + uri + ") in the default browser."*/, e);
        }
    }

}
