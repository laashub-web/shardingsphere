/*
 * Copyright 2016-2018 shardingsphere.io.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package io.shardingsphere.transaction.manager.xa;

import io.shardingsphere.core.constant.DatabaseType;
import io.shardingsphere.core.constant.transaction.TransactionType;
import io.shardingsphere.spi.xa.BackendDataSourceFactory;
import io.shardingsphere.transaction.manager.ShardingTransactionManagerRegistry;

import javax.sql.DataSource;
import javax.sql.XADataSource;
import java.util.HashMap;
import java.util.Map;

public final class XABackendDataSourceConvert implements BackendDataSourceFactory {
    
    private static XATransactionManager XA_MANAGER = (XATransactionManager) ShardingTransactionManagerRegistry.getInstance().getShardingTransactionManager(TransactionType.XA);
    
    @Override
    public Map<String, DataSource> build(final Map<String, DataSource> dataSourceMap, DatabaseType databaseType) {
        Map<String, DataSource> result = new HashMap<>(dataSourceMap.size(), 1);
        for (Map.Entry<String, DataSource> entry : dataSourceMap.entrySet()) {
//            result.put(entry.getKey(), TM_MANAGER.wrapDataSource())
        }
        return null;
    }
    
    private XADataSource newXADataSource(DatabaseType databaseType) {
        return null;
    }
}
