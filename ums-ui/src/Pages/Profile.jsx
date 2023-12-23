import {Header} from "../Components";

const Profile = () => {
  return (
      <div className="m-2 md:m-10 mt-24 p-2 md:p-10 bg-white rounded-3xl">
        <Header category="Page" title="My Profile"/>
        <div>
          <form className="mt-6">
            {/* Thông tin học vấn */}
            <div className="mb-6">
              <h2 className="text-lg font-semibold">Thông tin học vấn</h2>
              <div className="flex justify-between">
                <label className="w-1/2">
                  <span className="text-gray-700">Trạng thái</span>
                  <input
                      type="text"
                      name="educationStatus"
                      className="w-full block px-4 py-2 mt-2 border-gray-300 rounded-md shadow-sm focus:border-indigo-300 focus:ring focus:ring-indigo-200 focus:ring-opacity-50"
                      placeholder="Đang học"
                  />
                </label>
                <label className="w-1/2">
                  <span className="text-gray-700">Mã hồ sơ</span>
                  <input
                      type="text"
                      name="profileCode"
                      className="w-full block px-4 py-2 mt-2 border-gray-300 rounded-md shadow-sm focus:border-indigo-300 focus:ring focus:ring-indigo-200 focus:ring-opacity-50"
                      placeholder="2231123101"
                  />
                </label>
              </div>
              <div className="flex justify-between">
                <label className="w-1/2">
                  <span className="text-gray-700">Ngày vào trường</span>
                  <input
                      type="text"
                      name="admissionDate"
                      className="w-full block px-4 py-2 mt-2 border-gray-300 rounded-md shadow-sm focus:border-indigo-300 focus:ring focus:ring-indigo-200 focus:ring-opacity-50"
                      placeholder="13/7/2022"
                  />
                </label>
                <label className="w-1/2">
                  <span className="text-gray-700">Lớp học</span>
                  <input
                      type="text"
                      name="class"
                      className="w-full block px-4 py-2 mt-2 border-gray-300 rounded-md shadow-sm focus:border-indigo-300 focus:ring focus:ring-indigo-200 focus:ring-opacity-50"
                      placeholder="CN22LT"
                  />
                </label>
              </div>
              <div className="flex justify-between">
                <label className="w-1/2">
                  <span className="text-gray-700">Cơ sở</span>
                  <input
                      type="text"
                      name="campus"
                      className="w-full block px-4 py-2 mt-2 border-gray-300 rounded-md shadow-sm focus:border-indigo-300 focus:ring focus:ring-indigo-200 focus:ring-opacity-50"
                      placeholder="ĐH GTVT HCM"
                  />
                </label>
                <label className="w-1/2">
                  <span className="text-gray-700">Bậc đào tạo</span>
                  <input
                      type="text"
                      name="educationLevel"
                      className="w-full block px-4 py-2 mt-2 border-gray-300 rounded-md shadow-sm focus:border-indigo-300 focus:ring focus:ring-indigo-200 focus:ring-opacity-50"
                      placeholder="Đại học - vừa làm vừa học - Tín chỉ"
                  />
                </label>
              </div>
              <div className="flex justify-between">
                <label className="w-1/2">
                  <span className="text-gray-700">Loại hình đào tạo</span>
                  <input
                      type="text"
                      name="trainingType"
                      className="w-full block px-4 py-2 mt-2 border-gray-300 rounded-md shadow-sm focus:border-indigo-300 focus:ring focus:ring-indigo-200 focus:ring-opacity-50"
                      placeholder="Liên thông - vừa làm vừa học"
                  />
                </label>
                <label className="w-1/2">
                  <span className="text-gray-700">Khoa</span>
                  <input
                      type="text"
                      name="faculty"
                      className="w-full block px-4 py-2 mt-2 border-gray```javascript
                300 rounded-md shadow-sm focus:border-indigo-300 focus:ring focus:ring-indigo-200 focus:ring-opacity-50"
                      placeholder="Khoa Công nghệ thông tin"
                  />
                </label>
              </div>
              <div className="flex justify-between">
                <label className="w-1/2">
                  <span className="text-gray-700">Ngành</span>
                  <input
                      type="text"
                      name="major"
                      className="w-full block px-4 py-2 mt-2 border-gray-300 rounded-md shadow-sm focus:border-indigo-300 focus:ring focus:ring-indigo-200 focus:ring-opacity-50"
                      placeholder="Công nghệ thông tin"
                  />
                </label>
                <label className="w-1/2">
                  <span className="text-gray-700">Chuyên ngành</span>
                  <input
                      type="text"
                      name="specialization"
                      className="w-full block px-4 py-2 mt-2 border-gray-300 rounded-md shadow-sm focus:border-indigo-300 focus:ring focus:ring-indigo-200 focus:ring-opacity-50"
                      placeholder="Công nghệ thông tin"
                  />
                </label>
              </div>
              <label>
                <span className="text-gray-700">Khóa học</span>
                <input
                    type="text"
                    name="course"
                    className="w-full block px-4 py-2 mt-2 border-gray-300 rounded-md shadow-sm focus:border-indigo-300 focus:ring focus:ring-indigo-200 focus:ring-opacity-50"
                    placeholder="2022"
                />
              </label>
            </div>

            {/* Thông tin cá nhân */}
            <div className="mb-6">
              <h2 className="text-lg font-semibold">Thông tin cá nhân</h2>
              <div className="flex justify-between">
                <label className="w-1/2">
                  <span className="text-gray-700">Ngày sinh</span>
                  <input
                      type="text"
                      name="dateOfBirth"
                      className="w-full block px-4 py-2 mt-2 border-gray-300 rounded-md shadow-sm focus:border-indigo-300 focus:ring focus:ring-indigo-200 focus:ring-opacity-50"
                      placeholder="18/03/1996"
                  />
                </label>
                <label className="w-1/2">
                  <span className="text-gray-700">Dân tộc</span>
                  <input
                      type="text"
                      name="ethnicity"
                      className="w-full block px-4 py-2 mt-2 border-gray-300 rounded-md shadow-sm focus:border-indigo-300 focus:ring focus:ring-indigo-200 focus:ring-opacity-50"
                      placeholder=""
                  />
                </label>
              </div>
              <div className="flex justify-between">
                <label className="w-1/2">
                  <span className="text-gray-700">Tôn giáo</span>
                  <input
                      type="text"
                      name="religion"
                      className="w-full block px-4 py-2 mt-2 border-gray-300 rounded-md shadow-sm focus:border-indigo-300 focus:ring focus:ring-indigo-200 focus:ring-opacity-50"
                      placeholder=""
                  />
                </label>
                <label className="w-1/2">
                  <span className="text-gray-700">Khu vực</span>
                  <input
                      type="text"
                      name="area"
                      className="w-full block px-4 py-2 mt-2 border-gray-300 rounded-md shadow-sm focus:border-indigo-300 focus:ring focus:ring-indigo-200 focus:ring-opacity-50"
                      placeholder=""
                  />
                </label>
              </div>
              <div className="flex justify-between">
                <label className="w-1/2">
                  <span className="text-gray-700">Số CMND (CCCD)</span>
                  <input
                      type="text"
                      name="idCardNumber"
                      className="w-full block px-4 py-2 mt-2 border-gray-300 rounded-md shadow-sm focus:border-indigo-300 focus:ring focus:ring-indigo-200 focus:ring-opacity-50"
                      placeholder="045096008879"
                  />
                </label>
                <label className="w-1/2">
                  <span className="text-gray-700">Ngày cấp</span>
                  <input
                      type="text"
                      name="idCardIssueDate"
                      className="w-full block px-4 py-2 mt-2 border-gray-300 rounded-md shadow-sm focus:border-indigo-300 focus:ring focus:ring-indigo-200 focus:ring-opacity-50"
                      placeholder="045096008879"
                  />
                </label>
              </div>
            </div>

            <div className="mb-6">
              <button
                  type="submit"
                  className="
            h-10
            px-5
            text-indigo-100
            bg-indigo-700
            rounded-lg
            transition-colors
            duration-150
            focus:shadow-outline
            hover:bg-indigo-800
          "
              >
                Contact Us
              </button>
            </div>
            <div></div>
          </form>
        </div>
      </div>
  )
}

export default Profile
