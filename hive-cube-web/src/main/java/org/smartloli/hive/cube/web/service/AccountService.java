/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.smartloli.hive.cube.web.service;

import java.util.List;
import java.util.Map;

import org.smartloli.hive.cube.common.pojo.Signiner;

/**
 * Account service interface.
 * 
 * @author smartloli.
 *
 *         Created by May 16, 2017
 */
public interface AccountService {

	public int delete(Signiner signin);
	
	public Signiner findUserByRtxNo(int rtxno);

	public List<Signiner> findUserBySearch(Map<String, Object> params);

	public String findUserById(int id);
	
	public int insertUser(Signiner signin);

	public int modify(Signiner signin);
	
	public Signiner login(String username, String password);

	public int reset(Signiner signin);

	public int userCounts();
	
	public List<String> getUserEmails();
	
}
