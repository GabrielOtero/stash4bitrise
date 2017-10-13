/**
 * Copyright 2015 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package br.com.dextra.stash4bitrise;

import br.com.dextra.stash4bitrise.pojo.PostBody;
import br.com.dextra.stash4bitrise.pojo.StashPost;
import com.google.gson.Gson;

import xyz.luan.facade.HttpFacade;
import xyz.luan.facade.Response;

import java.io.*;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Stah4BitriseServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    PrintWriter out = resp.getWriter();
    out.println("Stash for Bitrise Bridge");
    System.out.println("Stash for Bitrise Bridge");
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String body = getBody(req);
    System.out.println(body);
    Gson gson = new Gson();

    StashPost post = gson.fromJson(body, StashPost.class);

    String branch = post.getRefChanges()[0].getRefId().split("/")[2];
    System.out.println(branch);

    String postBody = gson.toJson(new PostBody(branch, "YdoNN9sdqaO96ko-WvO8tA"));
    Response response = new HttpFacade("https://www.bitrise.io/app/9a88634ccfc4a87d/build/start.json").body(postBody).post();

    System.out.println(response.status());
    System.out.println(response.content());
  }

  public static String getBody(HttpServletRequest request) throws IOException {

    String body = null;
    StringBuilder stringBuilder = new StringBuilder();
    BufferedReader bufferedReader = null;

    try {
      InputStream inputStream = request.getInputStream();
      if (inputStream != null) {
        bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        char[] charBuffer = new char[128];
        int bytesRead = -1;
        while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
          stringBuilder.append(charBuffer, 0, bytesRead);
        }
      } else {
        stringBuilder.append("");
      }
    } catch (IOException ex) {
      throw ex;
    } finally {
      if (bufferedReader != null) {
        try {
          bufferedReader.close();
        } catch (IOException ex) {
          throw ex;
        }
      }
    }

    body = stringBuilder.toString();
    return body;
  }

}
