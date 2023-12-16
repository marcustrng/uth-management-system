import React from 'react';
import {
  GridComponent,
  ColumnsDirective,
  ColumnDirective,
  Page,
  Selection,
  Inject,
  Edit,
  Toolbar,
  Sort,
  Filter
} from '@syncfusion/ej2-react-grids';

import {customersData, customersGrid} from '../Data/dummy';
import {Header} from '../Components';
import axios from "axios";

const Customers = async () => {

  // const token = '..your token..'
  // const resp = await axios.get(`http://127.0.0.1:8080/students/api/v1/students`, {
  //   headers: {
  //     'Authorization': `token ${token}`
  //   }
  // })
  //
  // console.log("resp")

  return (
      <div className="m-2 md:m-10 mt-24 p-2 md:p-10 bg-white rounded-3xl">
        <Header category="Page" title="Quản Lý Sinh Viên"/>
        <GridComponent
            dataSource={customersData}
            allowPaging
            allowSorting
            toolbar={['Delete']}
            editSettings={{allowDeleting: true, allowEditing: true}}
            width='auto'
        >
          <ColumnsDirective>
            {customersGrid.map(
                (item, index) => <ColumnDirective key={index} {...item} />)}
          </ColumnsDirective>
          <Inject services={[Page, Toolbar, Selection, Edit, Sort, Filter]}/>
        </GridComponent>
      </div>
  )
}

export default Customers
